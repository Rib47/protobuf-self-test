package com.example;

import com.example.address.AddressBookManager;
import com.example.address.AddressBookProtos.AddressBook;
import com.google.protobuf.DescriptorProtos.FileDescriptorSet;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.DynamicMessage;

import java.io.File;
import java.io.InputStream;

public class SelfDescribingMessageDemo {

    private static final String SOURCE_BOOK_FILENAME = "test.ab";
    private static final String ADDRESS_BOOK_PROTO_FILENAME = File.separator + "address.proto";
    private static final String ADDRESS_BOOK_DESC_FILENAME = File.separator + "address.desc";

    public static void main(String[] args) throws Exception {
        AddressBook book = AddressBookManager.readFromFile(SOURCE_BOOK_FILENAME);
        AddressBookManager.print(book);

        InputStream is1 = SelfDescribingMessageDemo.class.getResourceAsStream(ADDRESS_BOOK_PROTO_FILENAME);

//        FileDescriptorProto descriptor = FileDescriptorProto.parseDelimitedFrom(is1);
//        System.out.println("AddressBook descriptor from *.proto:\n" + descriptor.toString());

        InputStream is = SelfDescribingMessageDemo.class.getResourceAsStream(ADDRESS_BOOK_DESC_FILENAME);

        FileDescriptorSet set = FileDescriptorSet.parseFrom(is);

        FileDescriptor fd = Descriptors.FileDescriptor.buildFrom(set.getFile(0), new Descriptors.FileDescriptor[]{});
        Descriptor messageType = fd.getMessageTypes().get(1);

        byte[] data = book.toByteArray();
        DynamicMessage message = DynamicMessage.parseFrom(messageType, data);

        System.out.println("\n Dyn message:\n" + message);


    }
}
