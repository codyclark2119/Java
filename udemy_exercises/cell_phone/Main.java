package cell_phone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CellPhone myCell = new CellPhone();

    public static void main(String[] args) {
        boolean quit = false;
        System.out.println("Welcome");
        printMenu();
        while (!quit) {
            String userChoice = scanner.nextLine();
            switch (userChoice.toUpperCase()) {
                case "D":
                    myCell.showContacts();
                    printMenu();
                    break;
                case "A":
                    addNewContact();
                    printMenu();
                    break;
                case "R":
                    removeContact();
                    printMenu();
                    break;
                case "M":
                    updateContact();
                    printMenu();
                    break;
                case "S":
                    queryContact();
                    printMenu();
                    break;
                case "Q":
                    System.out.println("Ending...");
                    quit = true;
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (myCell.addContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone: " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact's name: ");
        String name = scanner.nextLine();
        Contact existingContact = myCell.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (myCell.modifyContact(existingContact, newContact)) {
            System.out.println("Successfully updated contact");
        } else {
            System.out.println("Error updated contact.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact's name: ");
        String name = scanner.nextLine();
        Contact existingContact = myCell.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        if (myCell.removeContact(existingContact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact's name: ");
        String name = scanner.nextLine();
        Contact existingContact = myCell.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out
                .println("Name: " + existingContact.getName() + " phone number: " + existingContact.getPhoneNumber());
    }

    private static void printMenu() {
        System.out.println(
                "Type an option letter: \n (D)isplay contacts \n (A)dd contact \n (R)emove contact \n (M)odify contact \n (S)earch contacts \n (Q)uit");
    }
}