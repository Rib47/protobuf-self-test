package com.example.selfmessage;

import com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage;
import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.DescriptorProtos.FileDescriptorSet;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.DescriptorValidationException;
import com.google.protobuf.DynamicMessage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SelfDescribingMessageManager {

    private static final String PHONE_TYPE_DESCRIPTOR_FILENAME = File.separator + "phone_type.descr";
    private static final String PERSON_DESCRIPTOR_FILENAME = File.separator + "person.descr";
    private static final String COMPOSITE_BOOK_DESCRIPTOR_FILENAME = File.separator + "address_book_composite.descr";
    private static final String COMPOSITE_PERSON_DESCRIPTOR_FILENAME = File.separator + "person_composite.descr";

    public static DynamicMessage readDynamicMessageFromFile(String filename) throws IOException, DescriptorValidationException {
        SelfDescribingMessage message = readFromFile(filename);
        DynamicMessage dynamicMessage = convertToDynamicMessageWithFullDependencyTree(message);
        return dynamicMessage;
    }

    public static DynamicMessage convertToDynamicMessageWithFullDependencyTree(SelfDescribingMessage message) throws IOException, DescriptorValidationException {

        FileDescriptorSet phoneTypeDescriptor = getDescriptorSetFromFile(PHONE_TYPE_DESCRIPTOR_FILENAME);
        Descriptors.FileDescriptor fdPhoneType = Descriptors.FileDescriptor.buildFrom(
                phoneTypeDescriptor.getFile(0),
                new Descriptors.FileDescriptor[]{});

        FileDescriptorSet personDescriptor = getDescriptorSetFromFile(PERSON_DESCRIPTOR_FILENAME);
        Descriptors.FileDescriptor fdPerson = Descriptors.FileDescriptor.buildFrom(
                personDescriptor.getFile(0),
                new Descriptors.FileDescriptor[]{fdPhoneType});

        List<Descriptors.FileDescriptor> dependencies = new ArrayList<>();
        dependencies.add(fdPerson);

        return convertToDynamicMessage(message, dependencies);

    }

    private static DynamicMessage convertToDynamicMessage(SelfDescribingMessage message, List<Descriptors.FileDescriptor> dependencies)
                    throws IOException, DescriptorValidationException {


        FileDescriptorSet descriptorSet = message.getDescriptorSet();
        DescriptorProtos.FileDescriptorProto mainDescriptor = descriptorSet.getFile(0);

        Descriptors.FileDescriptor[] dependencyArray = dependencies.toArray(new Descriptors.FileDescriptor[dependencies.size()]);

        Descriptors.FileDescriptor fd = Descriptors.FileDescriptor.buildFrom(mainDescriptor, dependencyArray);
        Descriptor messageType = fd.getMessageTypes().get(0);

        ByteString data = message.getMessageData();

        return DynamicMessage.parseFrom(messageType, data);
    }


    public static SelfDescribingMessage readFromFile(String filename) throws IOException {
        return SelfDescribingMessage.parseFrom(new FileInputStream(filename));
    }

    public static void saveSdMessage(FileDescriptorSet descriptorSet, byte[] messageData, String filename) throws IOException {
        SelfDescribingMessage message = SelfDescribingMessage.newBuilder()
                .setDescriptorSet(descriptorSet)
                .setMessageData(ByteString.copyFrom(messageData))
                .build();
        saveSdMessage(message, filename);
    }

    public static void saveSdMessage(SelfDescribingMessage message, String filename) throws IOException {
        FileOutputStream os = null;
        try {
            File file = new File(filename);
            file.createNewFile();
            os = new FileOutputStream(file);
            message.writeTo(os);
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

    public static FileDescriptorSet getDescriptorSetFromFile(String filename) throws IOException, DescriptorValidationException {
        InputStream is = SelfDescribingMessageManager.class.getResourceAsStream(filename);
        return FileDescriptorSet.parseFrom(is);
    }
}
