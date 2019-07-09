package com.test2.bubbleSort;

public class Person {
    public String name;
    public String lastName;
    public int year_Of_Birth;


    public Person(String name, String lastName, int year_Of_Birth) {
        this.name = name;
        this.lastName = lastName;
        this.year_Of_Birth = year_Of_Birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year_Of_Birth=" + year_Of_Birth +
                '}';
    }
}
