package com.company;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        if (name == null) {
            System.out.println("Sorry, but Persons cannot be created without required information.");
        }
        else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (name == null) {
            System.out.println("Sorry, but Persons cannot be created without required information.");
        }
        else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException ("Age is wrong!");
        }
        else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person smn;
        if (validateReceivedData()) {
            smn = new Person(this);
        } else {
            throw new IllegalArgumentException("Sorry, but Persons cannot be created without required information.");
        }
        return smn;
    }

    private boolean validateReceivedData() {
        return (name != null && surname != null);
    }
}
