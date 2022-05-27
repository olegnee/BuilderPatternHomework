package com.company;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder() {

    }

    public PersonBuilder setName (String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person smn = null;
        if (validateReceivedData()) {
            smn = new Person(this);
        } else {
            System.out.println("Sorry, but Persons cannot be created without required information.");
        }
        return smn;
    }

    private boolean validateReceivedData() {
        return (name != null && surname != null);
    }
}
