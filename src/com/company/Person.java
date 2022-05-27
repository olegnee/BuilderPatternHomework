package com.company;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    private String address;

    Person(PersonBuilder personBuilder){
        name = personBuilder.name;
        surname = personBuilder.surname;
        age = personBuilder.age;
        address = personBuilder.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAddress() {
        return address != null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void happyBirthday() {
        age =+ 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    public PersonBuilder newChildPerson (){
        PersonBuilder child = new PersonBuilder().build();
        return child;
    }
}
