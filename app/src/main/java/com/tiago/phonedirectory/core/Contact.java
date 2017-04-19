package com.tiago.phonedirectory.core;

public class Contact {

    String name;

    public Contact(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}
