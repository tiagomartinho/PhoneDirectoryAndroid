package com.tiago.phonedirectory.core;

import java.util.List;

public interface ContactsView {
    void showNoContacts();
    void showContacts(List<Contact> contacts);
}