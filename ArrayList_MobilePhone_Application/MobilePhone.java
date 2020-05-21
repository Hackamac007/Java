package ArrayList_MobilePhone_Application;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    // Remove contact
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition<0) {
            System.out.println("Contact not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        return true;
    }

    // To add contact

    public boolean addContact(Contact contact){
        // Check if contact already on file
        if(findContact(contact.getName()) >=0){
            System.out.println("Contact already present");
            return false;
        }
        myContacts.add(contact);
        System.out.println("Contact added");
        return true;
    }

    // Update contact
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0) {
            System.out.println("Contact not found");
            return false;
        }

        this.myContacts.set(foundPosition,newContact);
        System.out.println("Contact replaced");
        return true;
    }

    // Query contact by name or by Contact
    public String queryContact(Contact contact){
        if(findContact(contact)>0)
            return contact.getName();
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>=0)
            return this.myContacts.get(position);
        return null;
    }



    // Helper functions to find contact by name or by Contact in ArrayList
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i=0; i< this.myContacts.size();i++){
            Contact contact=this.myContacts.get(i);
            if(contact.getName().equals(name))
                return i;
        }
        return -1;
    }

    // To print contacts
    public void printContacts(){
        System.out.println("Contact list");
        for(int i=0; i< this.myContacts.size();i++){
            System.out.println("Contact name:"+ this.myContacts.get(i).getName() +"\n Contact number: "+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }



}
