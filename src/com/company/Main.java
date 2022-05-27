package com.company;

public class Main {

    public static void main(String[] args) {
	Person someone = new PersonBuilder()
            .setName("Анна")
            .setSurname("Вольф")
            .setAge(31)
            .setAddress("Сидней")
            .build();
        System.out.println(someone);

        Person son = someone.newChildPerson()
                .setName("Антошка")
                .build();
        System.out.println("У " + someone + " есть сын, " + son);
    }

}
