package com.kaushal.ems.exceptions;

public class EmployeeNotFoundExceptions extends Exception{
    private int empId;
    public EmployeeNotFoundExceptions(int empId) {
        this.empId = empId;
    }

    public String toString(){
        return "Employee Not Found " + this.empId;
    }
}
