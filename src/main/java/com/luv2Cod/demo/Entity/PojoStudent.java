package com.luv2Cod.demo.Entity;


public class PojoStudent {
     private String firstName;
     private String lastName;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public PojoStudent() {
    }
    public PojoStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
}
