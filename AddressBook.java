package Assignment11;

import java.util.ArrayList;

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
            if (contacts.isEmpty()) {
                System.out.println("No contacts found.");
            } else {
                for (Contact contact : contacts) {
                    System.out.println(contact);
                }

            }
        }
    }

