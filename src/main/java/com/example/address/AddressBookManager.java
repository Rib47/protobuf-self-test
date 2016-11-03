package com.example.address;

import com.example.address.AddressBookProtos.AddressBook;
import com.example.address.AddressBookProtos.Person;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public final class AddressBookManager {

    public static AddressBook readFromFile(String filename) throws IOException {
        // Read the existing address book.
        return AddressBook.parseFrom(new FileInputStream(filename));
    }

    public static void addPersonToAddressBook(String filename) throws Exception {
        AddressBook.Builder addressBookBuilder = AddressBook.newBuilder();

        // Read the existing address book.
        try {
            InputStream in = new FileInputStream(filename);
            addressBookBuilder.mergeFrom(in, null);
        } catch (FileNotFoundException e) {
            System.out.println(filename + ": File not found.  Creating a new file.");
        }

        // Add an address.
        addressBookBuilder.addPerson(promptForPersonInput(
                new BufferedReader(new InputStreamReader(System.in)), System.out));

        // Write the new address book back to disk.
        FileOutputStream output = new FileOutputStream(filename);
        addressBookBuilder.build().writeTo(output);
        output.close();
    }

    // This function fills in a Person message based on user input.
    private static Person promptForPersonInput(BufferedReader stdin,
                                               PrintStream stdout) throws IOException {
        Person.Builder person = Person.newBuilder();

        stdout.print("Enter person ID: ");
        person.setId(Integer.valueOf(stdin.readLine()));

        stdout.print("Enter name: ");
        person.setName(stdin.readLine());

        stdout.print("Enter email address (blank for none): ");
        String email = stdin.readLine();
        if (email.length() > 0) {
            person.setEmail(email);
        }

        while (true) {
            stdout.print("Enter a phone number (or leave blank to finish): ");
            String number = stdin.readLine();
            if (number.length() == 0) {
                break;
            }

            Person.PhoneNumber.Builder phoneNumber =
                    Person.PhoneNumber.newBuilder().setNumber(number);

            stdout.print("Is this a mobile, home, or work phone? ");
            String type = stdin.readLine();
            if (type.equals("mobile")) {
                phoneNumber.setType(Person.PhoneType.MOBILE);
            } else if (type.equals("home")) {
                phoneNumber.setType(Person.PhoneType.HOME);
            } else if (type.equals("work")) {
                phoneNumber.setType(Person.PhoneType.WORK);
            } else {
                stdout.println("Unknown phone type.  Using default.");
            }

            person.addPhone(phoneNumber);
        }

        return person.build();
    }

    // Iterates though all people in the AddressBook and prints info about them.
    public static void printAddressBook(AddressBook addressBook) {
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