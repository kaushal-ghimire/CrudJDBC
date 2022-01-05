package com.kaushal.ems.dto;

public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private int daysAttended;

    public Employee(){

    }
    public Employee(int empId, String empName, String designation, int daysAttended) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.daysAttended = daysAttended;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }
}
