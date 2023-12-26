package com.collectionassignment;
import java.io.*;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class AddressBookSystem {

        private Dictionary<String, AddressBook> addressBooks;

        public AddressBookSystem() {
            addressBooks = new Hashtable<>();
        }

        public void addAddressBook(String name) {
            AddressBook addressBook = new AddressBook(name);
            addressBooks.put(name, addressBook);
        }

        public void displayAllAddressBooks() {
            Enumeration<String> keys = addressBooks.keys();
            while (keys.hasMoreElements()) {
                String name = keys.nextElement();
                AddressBook addressBook = addressBooks.get(name);
                addressBook.display();
            }
        }

        public void addPersonToAddressBook(String name, Person person) {
            AddressBook addressBook = addressBooks.get(name);
            if (addressBook != null) {
                addressBook.addPerson(person);
                System.out.println("Person " + person.getName() + " added to Address Book " + name);
            } else {
                System.out.println("Address Book " + name + " not found.");
            }
        }

        public Person searchPersonAcrossAddressBooks(String name) throws IOException, ClassNotFoundException {
            Enumeration<String> keys = addressBooks.keys();
            while (keys.hasMoreElements()) {
                String addressBookName = keys.nextElement();
                AddressBook addressBook = addressBooks.get(addressBookName);
                Person person = addressBook.searchPerson(name);
                if (person != null) {
                    return person;
                }
            }
            return null;
        }
            public void saveAddressBooksToFile() throws IOException {
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\DELL\\Desktop\\ClassRoom\\Java\\test.txt"));
                outputStream.writeObject(addressBooks);
                outputStream.close();
            }

            public void loadAddressBooksFromFile() throws IOException, ClassNotFoundException {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\DELL\\Desktop\\ClassRoom\\Java\\test.txt"));
                addressBooks = (Dictionary<String, AddressBook>) inputStream.readObject();
                inputStream.close();
            }
        }


