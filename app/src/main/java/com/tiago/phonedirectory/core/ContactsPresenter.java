package com.tiago.phonedirectory.core;

import java.util.List;

public class ContactsPresenter {

    private final ContactsView view;
    private final ContactsRepository repository;

    public ContactsPresenter(ContactsView view, ContactsRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    public void showAll() {
        List<Contact> contacts = repository.all();
        if (contacts.isEmpty()) {
            view.showNoContacts();
        } else {
            view.showContacts(contacts);
        }
    }
}
