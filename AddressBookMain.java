package Assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        // Create a new AddressBook
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        // Add a new contact using Console inputs
        System.out.println("Enter contact details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Contact newContact = new Contact(name, phoneNumber, email);
        addressBook.addContact(newContact);


        // Display all contacts in the address book
        System.out.println("All Contacts:");
        addressBook.displayContacts();
    }
}

