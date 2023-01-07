package com.example.JSPTutorial.Entities;

public class Person {
    private String name;
    private String numberPhone;
    private String address;

    public Person(String name, String numberPhone, String address) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
