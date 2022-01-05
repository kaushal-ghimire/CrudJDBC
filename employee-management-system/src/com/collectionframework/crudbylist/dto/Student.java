package com.collectionframework.crudbylist.dto;

public class Student {
    private String firstName;
    private String lastName;
    private int rollNo;

    public Student(){

    }
    public Student(int roll,String firstname,String lastname){
        this.rollNo = roll;
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString(){
        return rollNo + " " + firstName + " " + lastName;
    }
}
