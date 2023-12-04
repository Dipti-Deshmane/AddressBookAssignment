package Assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        // Create a new AddressBook

        Scanner sc = new Scanner(System.in);

        String choice;
        AddressBook addressBook = new AddressBook();

        do {
            System.out.println("1. Add a new contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Edit Name");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextLine();

        switch (choice) {
            case "1":
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Phone Number: ");
                String phoneNumber = sc.nextLine();
                System.out.print("Enter Gmail: ");
                String email = sc.nextLine();
                Contact contact = new Contact(name, phoneNumber,email);
                addressBook.addContact(contact);
                System.out.println("Contact added successfully!");
                break;
            case "2":
                System.out.println("All Contacts:");
                addressBook.displayContacts();
                break;
            case "3":
                System.out.println("Enter the First Name of the contact you want to edit:");
                String editFirstName = sc.nextLine();

                // Editing the contact
                addressBook.editName(editFirstName);
                break;
            case "4":
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }
        System.out.println();
    } while (!choice.equals("4"));

        sc.close();




    }
}

