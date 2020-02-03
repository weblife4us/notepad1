package com.pad;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Person person = new Person();

        System.out.println(person);
        person.setName("Bob");
        person.setSurename("Dany");
//        person.setdOb(LocalDate.of(2001,05,15));
//        System.out.println(LocalDate.now());
        System.out.println(person);
//        person.getdOb("1970-01-01");

        Contact contact = new Contact();
        contact.setPhone("+16475155265");

        //        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        contact.setPerson(person);
        System.out.println(" -------------------------     ");

        System.out.println(contact);


        NoteBook note = new NoteBook();
        note.setCurrentContact(contact);
        System.out.println(note);

//        note.getCurrentContact().getPerson().getName();
        note.getCurrentContact().getPerson().setName("new Name");

        Address address = new Address();
        address.build_number = "11111";
        address.postcode = "q2w3e4";
//        Contact contact = new Contact();


    }
}
