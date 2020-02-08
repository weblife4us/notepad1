package com.pad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

//        Collector collector = new Collector();

        Contact contact = new Contact();
        NoteBook note = new NoteBook();
        Person person = new Person();

//        collector.setPhone("1234567890");
//        collector.setName(" Ivan ");
//        collector.setSurname(" Petrov ");

        System.out.println(person);
        person.setName("Bob");
        person.setSurename("Dany");
        person.setdOb(LocalDate.of(2001, 05, 15));
        System.out.println(LocalDate.now());
        System.out.println(person);

        contact.setPhone("+16475155265");
        contact.setPerson(person);
        System.out.println(" ------------------------- contact -------------------     ");
        System.out.println(contact);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(contact);

        note.setContactList(contactList);

        System.out.println(" ------------------------- note -------------------     ");

//        note.getContactList().getPerson().setName("new Name");
//        note.getContactList().getPerson().getName();
        System.out.println(note);
        System.out.println(" ------------------------- collector -------------------     ");
//        System.out.println(collector);


    }
}
