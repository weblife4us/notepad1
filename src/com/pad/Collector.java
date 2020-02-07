package com.pad;

import java.time.LocalDate;

public class Collector {
    private Contact currentContact = new Contact();
    private NoteBook note = new NoteBook();
    private Person pers = new Person();
    private Address addr = new Address();

    private LocalDate dob;
    private String name;
    private String surname;
    private String phone;
    private String street;
    private String building;
    private String postcode;

    public Collector() {
    }

//    public Collector(Contact currentContact, String name) {
//        this.currentContact = currentContact;
//        this.name = name;
//    }

    public Contact getCurrentContact() {
        return currentContact;
    }

    public void setCurrentContact(Contact currentContact) {
        this.currentContact = currentContact;
    }

//    public Collector(Contact contact, String name,String surname) {
//        this.name = name;
//        this.surname = surname;
//    }
//    public Collector(Contact contact, String name,String surname,String phone, String street, String building, String postcode) {
//        this.name = name;
//        this.surname = surname;
//        this.phone = phone;
//        this.street = street;
//        this.building = building;
//        this.postcode = postcode;
//    }
//

    public String getPostcode() {
        Address address = new Address();
        this.postcode = address.getPostcode();
        return postcode;
    }

    public void setPostcode(String postcode) {
        Address address = new Address();
        this.postcode = postcode;
        address.setPostcode(postcode);
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
        Contact contact = new Contact();
        Person person = new Person();
        String namePerson;
        namePerson = person.getName();
        return namePerson;
    }

    public void setName(String name) {
        Person person = new Person();
        this.name = name;
        person.setName(name);
    }

    public String getSurname() {
        Person person = new Person();
        surname = person.getSurename();
        return surname;
    }

    public void setSurname(String surname) {
        Person person = new Person();
        this.surname = surname;
        person.setName(surname);
    }

    public String getPhone() {
        Contact contact = new Contact();
        phone = contact.getPhone();
        return phone;
    }

    public void setPhone(String phone) {
        Contact contact = new Contact();
        contact.setPhone(phone);
        this.phone = phone;
    }

    public String getStreet() {
        Address address = new Address();
        this.street = address.getStreet();
        return street;
    }

    public void setStreet(String street) {
        Address address = new Address();
        this.street = street;
        address.setStreet(street);
    }

    public String getBuilding() {
        Address address = new Address();
        this.building = address.getBuild_number();
        return building;
    }

    public void setBuilding(String building) {
        Address address = new Address();
        this.building = building;
        address.setBuild_number(building);
    }

    @Override
    public String toString() {
        return "Collector{" +
                "dob=" + dob +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
