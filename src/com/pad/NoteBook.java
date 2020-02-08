package com.pad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NoteBook {
    private List<Contact> contactList;

    public NoteBook() {
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void addContact(Contact contact){
        this.contactList.add(contact);

    }

    @Override
    public String toString() {

//        NoteBook c = new NoteBook();
//
//        List<Contact> contacts = new ArrayList<>();
//        Contact con = new Contact();
//        Contact con1 = new Contact();
//        contacts.add(con);
//        contacts.add(con1);
//
//        c.setContactList(contacts);

        return "NoteBook{" +
                "currentContact=" + contactList +
                '}';
    }
}
