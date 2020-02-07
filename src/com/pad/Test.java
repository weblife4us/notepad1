package com.pad;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Collector collector = new Collector();

        Contact contact = new Contact();
        NoteBook note = new NoteBook();
        Person person = new Person();

        collector.setPhone("1234567890");
        collector.setName(" Ivan ");
        collector.setSurname(" Petrov ");

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
        note.setCurrentContact(contact);
        System.out.println(" ------------------------- note -------------------     ");

        note.getCurrentContact().getPerson().setName("new Name");
        note.getCurrentContact().getPerson().getName();
        System.out.println(note);
        System.out.println(" ------------------------- collector -------------------     ");
        System.out.println(collector);


    }
}
