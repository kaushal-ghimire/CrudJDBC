package com.collectionframework.crudbylist.exceptions;

public class StudentNotFoundException extends Exception{

    private int roll;
    public StudentNotFoundException(int roll) {
        this.roll = roll;
    }

    public String toString(){
        return "Student Not Found " + this.roll;
    }
}
