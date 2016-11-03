package com.example.selfmessage;

import com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage;
import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos.FileDescriptorSet;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.DescriptorValidationException;
import com.google.protobuf.DynamicMessage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SelfDescribingMessageManager {


    public static DynamicMessage readDynamicMessageFromFile(String filename) throws IOException, DescriptorValidationException {
        SelfDescribingMessage message = readFromFile(filename);
        DynamicMessage dynamicMessage = convertToDynamicMessage(message);
        return dynamicMessage;
    }

    public static DynamicMessage convertToDynamicMessage(SelfDescribingMessage message) throws IOException, DescriptorValidationException {
        FileDescriptorSet descriptorSet = message.getDescriptorSet();
        Descriptors.FileDescriptor fd = Descriptors.FileDescriptor.buildFrom(descriptorSet.getFile(0), new Descriptors.FileDescriptor[]{});
        Descriptor messageType = fd.getMessageTypes().get(1);

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
}
