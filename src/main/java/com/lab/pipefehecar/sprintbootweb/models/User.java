package com.lab.pipefehecar.sprintbootweb.models;

public class User {
    private String name;
    private String lastname;
    private int age;

    public User(String name, String lastname, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public User(String name, String lastname) {
        this(lastname, name, 26);
    }


    public String getLastname() {
        return lastname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
