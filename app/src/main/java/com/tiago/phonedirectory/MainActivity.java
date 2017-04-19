package com.tiago.phonedirectory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.tiago.phonedirectory.core.Contact;
import com.tiago.phonedirectory.core.ContactsPresenter;
import com.tiago.phonedirectory.core.ContactsView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ContactsView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContactsPresenter presenter = new ContactsPresenter(this, new InMemoryContactsRepository());
        presenter.showAll();
    }

    @Override
    public void showNoContacts() {
        findViewById(R.id.noContactsTextView).setVisibility(View.VISIBLE);
    }

    @Override
    public void showContacts(List<Contact> contacts) {
        ListView listView = (ListView) findViewById(R.id.contactsListView);
        listView.setVisibility(View.VISIBLE);
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contacts);
        listView.setAdapter(adapter);
    }
}
