package com.baontq.model;

import java.io.Serializable;

/**
 *
 * @author MSI
 */
public class Employee implements Serializable{

    private String ID, name, email;
    private double luong;
    private int age;

    public Employee(String ID, String name, String email, double luong, int age) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.luong = luong;
        this.age = age;
    }

    public Employee() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
