package com.pad;

public class NoteBook {
    private Contact currentContact;

    public NoteBook() {
    }

    public NoteBook(Contact currentContact) {
        this.currentContact = currentContact;
    }

    public Contact getCurrentContact() {
        return currentContact;
    }

    public void setCurrentContact(Contact currentContact) {
        this.currentContact = currentContact;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "currentContact=" + currentContact +
                '}';
    }
}
