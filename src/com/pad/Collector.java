package com.pad;
import java.time.LocalDate;

public class Collector {
    private String dob;
    private String name;
    private String surename;
    private String phone;
    private String street;
    private String building;
    private String appartment;

    public Collector() {

    Person person = new Person();
    Contact contact = new Contact();
    NoteBook note = new NoteBook();

        System.out.println(person);
        person.setName("Bob");
        person.setSurename("Dany");
        person.setdOb(LocalDate.of(2001,05,15));
        System.out.println(LocalDate.now());

        System.out.println(person);
//        person.getdOb("1970-01-01");

        contact.setPhone("+16475155265");

        contact.setPerson(person);

        System.out.println(" -------------------------     ");
        System.out.println(contact);


        note.setCurrentContact(contact);
        System.out.println(note);

        note.getCurrentContact().getPerson().getName();
        note.getCurrentContact().getPerson().setName("new Name");


    }





//        System.out.println(person);
//        person.setName("Bob");
//        person.setSurename("Dany");
//        person.setdOb(LocalDate.of(2001,05,15));
//        System.out.println(LocalDate.now());
//
//        System.out.println(person);
//        person.getdOb("1970-01-01");
//
//        contact.setPhone("+16475155265");
//
//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        contact.setPerson(person);
//        System.out.println(" -------------------------     ");
//        System.out.println(contact);
//
//
//        note.setCurrentContact(contact);
//        System.out.println(note);
//
//        note.getCurrentContact().getPerson().getName();
//        note.getCurrentContact().getPerson().setName("new Name");
//
//    Address address = new Address();
//    address.build_number = "11111";
//    address.postcode = "q2w3e4";
//    Contact contact = new Contact();




}
