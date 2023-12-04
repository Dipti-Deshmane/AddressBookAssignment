package Assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
        private ArrayList<Contact> contacts;

        // Constructor
        public AddressBook() {
            contacts = new ArrayList<>();
        }

        // Method to add a new contact
        public void addContact(Contact contact) {

            contacts.add(contact);
        }

        // Method to display all contacts
        public void displayContacts() {

                for (Contact contact : contacts) {
                    System.out.println("Person Name: " + contact.getName());
                    System.out.println("Last Name: " + contact.getPhoneNumber());
                    System.out.println("Address: " + contact.getEmail());
                }

            }

            public void editName(String oldName) {
                for (Contact contact : contacts) {
                    if (contact.getName().equals(oldName)) {
                        // Prompt the user to enter new details
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter new name for the contact:");
                        System.out.print("New First Name: ");
                        String newFirstName = scanner.nextLine();
                        contact.setName(newFirstName);

                        System.out.println("Name is updated successfully.");
                        return;
                    }
                }
                System.out.println("Contact not found.");
            }
        }


