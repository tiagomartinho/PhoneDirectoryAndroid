package com.tiago.phonedirectory;

import com.tiago.phonedirectory.core.Contact;
import com.tiago.phonedirectory.core.ContactsRepository;

import java.util.Collections;
import java.util.List;

public class InMemoryContactsRepository implements ContactsRepository {
        @Override
        public List<Contact> all() {
            return Collections.singletonList(new Contact("Doe"));
        }
}