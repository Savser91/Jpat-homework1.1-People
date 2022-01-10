package com.company;

public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age < 0) throw new IllegalArgumentException("age can't be negative");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


    public Person build() {
        if (name == null || name.length() == 0 || surname == null || surname.length() == 0)
            throw new IllegalStateException("fields 'name' or 'surname' are empty");

        Person person = new Person(name, surname, age);
        if (address != null && address.length() > 0) {
            person.setAddress(address);
        }

        return person;
    }
}
