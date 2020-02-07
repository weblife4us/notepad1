package com.pad;

import java.time.LocalDate;

public class Collector {
    private LocalDate dob;
    private String name;
    private String surename;
    private String phone;
    private String street;
    private String building;
    private String appartment;

    public Collector() {
        Collector collector = new Collector();
        Person person = new Person();
        Contact contact = new Contact();
        NoteBook note = new NoteBook();
//      Contact currentContact;


        System.out.println(person);
        person.setName("Bob");
        person.setSurename("Dany");
        person.setdOb(LocalDate.of(2001, 05, 15));
        System.out.println(LocalDate.now());
        System.out.println(person);
//        person.getdOb("1970-01-01");
        contact.setPhone("+16475155265");
        contact.setPerson(person);
        System.out.println(" ------------------------- divider -------------------     ");
        System.out.println(contact);

        note.setCurrentContact(contact);

        System.out.println(note);

        note.getCurrentContact().getPerson().getName();
        note.getCurrentContact().getPerson().setName("new Name");


    }

    public LocalDate getDob() {
        Person person = new Person();
        dob = person.getdOb();
        return dob;
    }

    public void setDob(LocalDate dob) {
        Person person = new Person();
        this.dob = dob;
        person.setdOb(dob);
    }

    public String getName() {
        NoteBook note = new NoteBook();
        name = note.getCurrentContact().getPerson().getName();
        return name;
    }

    public void setName(String name) {
        NoteBook note = new NoteBook();
        this.name = name;
        note.getCurrentContact().getPerson().setName(name);

    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
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
