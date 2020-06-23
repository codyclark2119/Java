package udemy_exercises.cell_phone;

import java.util.*;

class CellPhone {
  Contact c = new Contact("cody", "4693161463");
  ArrayList<Contact> contacts = new ArrayList<Contact>();
  Scanner menuInput = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Welcome");
    CellPhone myCell = new CellPhone();
    myCell.userMenu();
  }

  void showContacts() {
    for (int i = 0; i < contacts.size(); i++) {
      System.out.println("Contact Name:");
      System.out.println(contacts.get(i).name);
      System.out.println("Contact Phone Number:");
      System.out.println(contacts.get(i).phoneNumber);
    }
  }

  void addContact() {
    System.out.println("Enter contact name:");
    // Scanner input1 = new Scanner(System.in);
    String name = menuInput.nextLine();
    System.out.println("Enter contact phone number:");
    // Scanner input2 = new Scanner(System.in);
    if ()
    String phoneNumber = menuInput.nextLine();
    // input1.close();
    // input2.close();
    Contact newUser = new Contact(name, phoneNumber);
    contacts.add(newUser);
  }

  void removecontact() {

  }

  void modifyContect() {

  }

  void searchContact() {

  }

  void userMenu() {
    System.out.println(
        "Type an option letter: \n (D)isplay contacts \n (A)dd contact \n (R)emove contact \n (M)odify contact \n (S)earch contacts \n (Q)uit");
    while (menuInput.hasNextLine()) {
      String userChoice = menuInput.next();
      switch (userChoice) {
        case "d":
          showContacts();
          break;
        case "a":
          addContact();
          break;
        case "r":
          removecontact();
          break;
        case "m":
          modifyContect();
          break;
        case "s":
          searchContact();
          break;
        case "q":
          menuInput.close();
          break;
        default:
          System.out.println("Enter a valid choice");
          userMenu();
          break;
      }
    }
  }
}

/*
 ** Cell Phone with Java Classes** - **CellPhone Class:** - Contact List - quit()
 * - showContacts() - addContact() - updateContat() - removeContact() -
 * searchContact() **When adding or updating be sure to check if the contact
 * already exists** **Be sure not to expose the inner workings of the Arraylist
 * to MobilePhone (use concepts of encapsulation to meet this requirement)**
 */
