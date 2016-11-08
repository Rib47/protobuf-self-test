package com.example;

import com.example.address.AddressBookManager;
import com.example.address.AddressBookProtos.AddressBook;
import com.example.selfmessage.SelfDescribingMessageHolder;
import com.example.selfmessage.SelfDescribingMessageManager;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos.FileDescriptorSet;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.DescriptorValidationException;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import io.protostuff.parser.Proto;
import io.protostuff.parser.ProtoUtil;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Map;

public class SelfDescribingMessageDemo {

    private static final String SOURCE_BOOK_FILENAME = "test.ab";
    private static final String ADDRESS_BOOK_DESCRIPTOR_FILENAME = File.separator + "address.desc";
    private static final String ADDRESS_BOOK_PROTO_FILE = "src/main/resources/address.proto";
    private static final String MESSAGE_FILENAME = "message.data";

    public static void main(String[] args) throws Exception {

//        DynamicMessage message = testSelfDescribingMessage();

//        validateProto(ADDRESS_BOOK_PROTO_FILE);

        String result = validateProtoWithCompiler(ADDRESS_BOOK_PROTO_FILE);
        if (result.length() == 0) {
            System.out.println("Validation success!");
        } else {
            System.out.println("Validation failed. Errors: \n" + result);
        }

        // *** TEST LAB  ***

//        Map<FieldDescriptor, Object> allFields = message.getAllFields();
//        System.out.println("\n Field descriptors list:\n");
//
//        // TODO: see - com.google.protobuf.TextFormat.Printer.print()
//        for (FieldDescriptor fieldDesc: allFields.keySet()) {
//            System.out.println("Field: " + fieldDesc);
//            DynamicMessage field = (DynamicMessage) allFields.get(fieldDesc);
//            System.out.println(field);
//        }
    }

    private static String validateProtoWithCompiler(String fileName) throws IOException, DescriptorValidationException {
        StringBuilder resultBuilder = new StringBuilder();

        String execName = "./protoc";
        String outputDir = "--java_out=./";

        String dependencyDir   = "-I=./";

        try {
            String line;
            ProcessBuilder pb = new ProcessBuilder(execName, dependencyDir,outputDir, fileName);
            Map<String, String> env = pb.environment();
            pb.redirectErrorStream(true);

            Process p = pb.start();
            p.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = br.readLine()) != null) {
                resultBuilder.append(line).append("\n");
            }
        } catch (Exception err) {
            err.printStackTrace();
            return err.getMessage();
        }
        return resultBuilder.toString();
    }

    private static void validateProto(String filename) throws IOException, DescriptorValidationException{

        File f = new File(filename);

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.err;
        System.setErr(ps);

        try {
            Proto proto = ProtoUtil.parseProto(f);
        } catch(Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.flush();
        System.setErr(old);

        // Show any errors/warnings was happen in parsing process
        System.out.println("\nParser output is: \n" + baos.toString());
    }

    private static DynamicMessage testSelfDescribingMessage() throws IOException, DescriptorValidationException{

        // write SD-message to file
        System.out.print("Reading address book from file \"" + SOURCE_BOOK_FILENAME +"\" ... ");
        AddressBook book = AddressBookManager.readFromFile(SOURCE_BOOK_FILENAME);
        System.out.println("Done.");
        System.out.println("Address book: \n" + book);
        System.out.println();

        System.out.print("Reading descriptor set from file \"" + ADDRESS_BOOK_DESCRIPTOR_FILENAME +"\" ... ");
        FileDescriptorSet descriptorSet = getDescriptorSetFromFile(ADDRESS_BOOK_DESCRIPTOR_FILENAME);
        System.out.println("Done.");
        System.out.println("Descriptor set: \n" + descriptorSet);
        System.out.println();

        System.out.print("Saving address book as self-describing message in file \"" + MESSAGE_FILENAME +"\" ... ");
        System.out.println("Done.");
        SelfDescribingMessageManager.saveSdMessage(descriptorSet, book.toByteArray(), MESSAGE_FILENAME);
        System.out.println();

        // read SD-message from file
        System.out.print("Reading self-describing message from file \"" + MESSAGE_FILENAME +"\" as DynamicMessage ... ");
        // DynamicMessage message = SelfDescribingMessageManager.readDynamicMessageFromFile(MESSAGE_FILENAME);
        SelfDescribingMessageHolder.SelfDescribingMessage sdMessage =  SelfDescribingMessageManager.readFromFile(MESSAGE_FILENAME);
        FileDescriptorSet fdSet = sdMessage.getDescriptorSet();
        DynamicMessage message = SelfDescribingMessageManager.convertToDynamicMessage(sdMessage);

        System.out.println("\n Dynamic message:\n" + message);

        return message;
    }

    private static DynamicMessage getAddressBookFromFile(String filename) throws IOException, DescriptorValidationException {
        AddressBook book = AddressBookManager.readFromFile(filename);
        AddressBookManager.printAddressBook(book);

        FileDescriptorSet set = getDescriptorSetFromFile(ADDRESS_BOOK_DESCRIPTOR_FILENAME);

        FileDescriptor fd = Descriptors.FileDescriptor.buildFrom(set.getFile(0), new Descriptors.FileDescriptor[]{});
        Descriptor messageType = fd.getMessageTypes().get(1);

        byte[] data = book.toByteArray();
        DynamicMessage message = DynamicMessage.parseFrom(messageType, data);

        System.out.println("\n Dyn message:\n" + message);

        return message;
    }

    private static FileDescriptorSet getDescriptorSetFromFile(String filename) throws IOException, DescriptorValidationException {
        InputStream is = SelfDescribingMessageDemo.class.getResourceAsStream(filename);
        return FileDescriptorSet.parseFrom(is);
    }

}
