package com.example.address;

import com.example.address.AddressBookProtos.AddressBook;
import com.example.address.AddressBookProtos.Person;

import java.io.FileInputStream;

class AddressBookManager {


    // Main function:  Reads the entire address book from a file and prints all
    //   the information inside.
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage:  AddressBookManager ADDRESS_BOOK_FILE");
            System.exit(-1);
        }

        AddressBook addressBook = readFromFile(args[0]);

        print(addressBook);
    }

    public static AddressBook readFromFile(String filename) throws Exception {
        // Read the existing address book.
        return AddressBook.parseFrom(new FileInputStream(filename));
    }

    // Iterates though all people in the AddressBook and prints info about them.
    public static void print(AddressBook addressBook) {
        for (Person person: addressBook.getPersonList()) {
            System.out.println("Person ID: " + person.getId());
            System.out.println("  Name: " + person.getName());
            if (person.hasEmail()) {
                System.out.println("  E-mail address: " + person.getEmail());
            }

            for (Person.PhoneNumber phoneNumber : person.getPhoneList()) {
                switch (phoneNumber.getType()) {
                    case MOBILE:
                        System.out.print("  Mobile phone #: ");
                        break;
                    case HOME:
                        System.out.print("  Home phone #: ");
                        break;
                    case WORK:
                        System.out.print("  Work phone #: ");
                        break;
                }
                System.out.println(phoneNumber.getNumber());
            }
        }
    }
}