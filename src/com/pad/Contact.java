package com.pad;

public class Contact {
    private String phone;
//    -----------------------------------------------
    private Person person;

    public Contact() {

    }

    public Contact(String phone, Person person) {
        this.phone = phone;
        this.person = person;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", person=" + person +
                '}';
    }
}
