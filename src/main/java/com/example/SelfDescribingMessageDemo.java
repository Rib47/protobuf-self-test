package com.example;

import com.example.address.AddressBookManager;
import com.example.address.AddressBookProto.AddressBook;
import com.example.selfmessage.SelfDescribingMessageHolder;
import com.example.selfmessage.SelfDescribingMessageManager;
import com.google.protobuf.DescriptorProtos.FileDescriptorSet;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.DescriptorValidationException;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.DynamicMessage;
import io.protostuff.parser.Proto;
import io.protostuff.parser.ProtoUtil;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

public class SelfDescribingMessageDemo {

    private static final String ADDRESS_BOOK_FILENAME = AddressBookManager.DEFAULT_ADDRESS_BOOK_FILE;
    private static final String ADDRESS_BOOK_DESCRIPTOR_FILENAME = File.separator + "address.descr";
    private static final String ADDRESS_BOOK_PROTO_FILE = "src/main/resources/address.proto";
    private static final String ADDRESS_BOOK_PROTO2_FILE = "src/main/resources/address_mini_proto2.proto";
    private static final String ADDRESS_BOOK_PROTO3_FILE = "src/main/resources/address_mini_proto3.proto";
    private static final String ADDRESS_BOOK_DESC_FILE = "src/main/resources/address.descr";
    private static final String OUT_DIR_PROTO = "target_proto";
    private static final String MESSAGE_FILENAME = "message.data";
    private static final String PROTO_COMPILER = "./protoc";

    public static void main(String[] args) throws Exception {

        DynamicMessage message = testSelfDescribingMessage();

//        validateProtoWithProtoStuff(ADDRESS_BOOK_PROTO2_FILE);

//        System.out.println("\nValidating proto2 file ...");
//        String result = validateProtoWithCompiler(ADDRESS_BOOK_PROTO_FILE, OUT_DIR_PROTO);
//        displayValidationResult(result);

//        System.out.println("\nValidating proto3 file ...");
//        String result3 = validateProtoWithCompiler(ADDRESS_BOOK_PROTO3_FILE, OUT_DIR_PROTO);
//        displayValidationResult(result3);


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

    private static void displayValidationResult(String result) {
        if (result.length() == 0) {
            System.out.println("Validation success!");
        } else {
            System.out.println("Validation failed. Errors: \n" + result);
        }
    }

    private static String validateProtoWithCompiler(String fileName, String outputFolder) throws IOException, DescriptorValidationException {
        StringBuilder resultBuilder = new StringBuilder();

        new File(outputFolder).mkdirs();

        String outputDir = "--java_out=./" + outputFolder;
        String descriptorOutput = "--descriptor_set_out=" + ADDRESS_BOOK_DESC_FILE;
        String dependencyDir   = "-I=./";

        try {
            String line;
            ProcessBuilder pb = new ProcessBuilder(PROTO_COMPILER, dependencyDir, outputDir, descriptorOutput, fileName);
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

    private static void validateProtoWithProtoStuff(String filename) throws IOException, DescriptorValidationException{

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
        System.out.print("Reading address book from file \"" + ADDRESS_BOOK_FILENAME +"\" ... ");
        AddressBook book = AddressBookManager.readFromFile(ADDRESS_BOOK_FILENAME);
        System.out.println("Done.");
        System.out.println("Address book: \n" + book.toString());
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
        SelfDescribingMessageHolder.SelfDescribingMessage sdMessage =  SelfDescribingMessageManager.readFromFile(MESSAGE_FILENAME);
        FileDescriptorSet fdSet = sdMessage.getDescriptorSet();
        DynamicMessage message = SelfDescribingMessageManager.convertToDynamicMessage(sdMessage);
        System.out.println("\n Dynamic message:\n" + message);

        // message analyzing
        List<DynamicMessage> personList = (List<DynamicMessage>) message.getAllFields().entrySet().iterator().next().getValue();
        System.out.println("\n Persons:\n" + personList);
        for (DynamicMessage person: personList) {
            System.out.println("Person fields:\n" + person.getAllFields());
        }


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
