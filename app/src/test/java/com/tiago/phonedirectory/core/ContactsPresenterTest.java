package com.tiago.phonedirectory.core;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ContactsPresenterTest {

    @Test
    public void without_contacts_show_empty_contacts_view() {
        when(repository.all()).thenReturn(noContacts());

        presenter.showAll();

        verify(view).showNoContacts();
    }

    @Test
    public void with_contacts_show_contacts_list_view() {
        when(repository.all()).thenReturn(contacts());

        presenter.showAll();

        verify(view).showContacts(contacts());
    }

    // Setup

    public static final Contact A_CONTACT = new Contact("");
    @Mock
    private ContactsView view;
    @Mock
    private ContactsRepository repository;

    private ContactsPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new ContactsPresenter(view, repository);
    }

    // Helper Methods

    private static List<Contact> noContacts() {
        return Collections.emptyList();
    }

    private static List<Contact> contacts() {
        return Collections.singletonList(A_CONTACT);
    }
}