package com.company;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        try{
            this.name = name;
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, but Persons cannot be created without required information.");
            e.printStackTrace();
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        try{
            this.surname = surname;
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, but Persons cannot be created without required information.");
            e.printStackTrace();
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
