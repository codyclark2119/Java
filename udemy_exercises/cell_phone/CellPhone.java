package cell_phone;

import java.util.*;

class CellPhone {
  private ArrayList<Contact> myContacts;

  public CellPhone() {
    this.myContacts = new ArrayList<Contact>();
  }

  public void showContacts() {
    for (int i = 0; i < myContacts.size(); i++) {
      System.out.println((i + 1) + "." + "Contact Name: " + myContacts.get(i).getName() + " Phone Number: "
          + myContacts.get(i).getPhoneNumber());
    }
    if (myContacts.size() == 0) {
      System.out.println("No contacts to list.");
    }
  }

  public boolean addContact(Contact contact) {
    if (searchContact(contact.getName()) >= 0) {
      System.out.println("Contact already exists");
      return false;
    }
    myContacts.add(contact);
    return true;
  }

  public boolean removeContact(Contact contact) {
    int foundPosition = searchContact(contact);
    if (foundPosition < 0) {
      System.out.println(contact.getName() + ", was not found.");
      return false;
    }
    this.myContacts.remove(foundPosition);
    System.out.println(contact.getName() + ", has been deleted.");
    return true;
  }

  public boolean modifyContact(Contact oldContact, Contact newContact) {
    int foundPosition = searchContact(oldContact);
    if (foundPosition < 0) {
      System.out.println(oldContact.getName() + ", was not found.");
      return false;
    }
    this.myContacts.set(foundPosition, newContact);
    System.out.println(newContact.getName() + ", has been updated.");
    return true;
  }

  private int searchContact(Contact contact) {
    return this.myContacts.indexOf(contact);
  }

  private int searchContact(String contactName) {
    for (int i = 0; i < this.myContacts.size(); i++) {
      Contact contact = this.myContacts.get(i);
      if (contact.getName().toUpperCase().equals(contactName.toUpperCase())) {
        return i;
      }
    }
    return -1;
  }

  public String queryContact(Contact contact) {
    if (searchContact(contact) >= 0) {
      return contact.getName();
    }
    return null;
  }

  public Contact queryContact(String name) {
    int position = searchContact(name);
    if (position >= 0) {
      return this.myContacts.get(position);
    }
    return null;
  }
}

/*
 ** Cell Phone with Java Classes** - **CellPhone Class:** - Contact List - quit()
 * - showContacts() - addContact() - updateContat() - removeContact() -
 * searchContact() **When adding or updating be sure to check if the contact
 * already exists** **Be sure not to expose the inner workings of the Arraylist
 * to MobilePhone (use concepts of encapsulation to meet this requirement)**
 */
