package com.kaushal.ems.main;

import com.kaushal.ems.service.EmployeeService;
import com.kaushal.ems.service.EmployeeServiceImpl;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.addEmployee(1,"Kaushal Ghimire","Full Stack Developer",93);
        employeeService.addEmployee(2,"Anisha Khatiwada","Full Stack Developer",15);
        employeeService.addEmployee(3,"Ramesh Gautam","QA",25);
        employeeService.addEmployee(4,"Celina Pokharel","UI/UX",35);
        employeeService.addEmployee(5,"Bikash Shah","Graphics Designer",35);
        employeeService.addEmployee(6,"Sudip","DBA",109);
        employeeService.addEmployee(7,"Junu","QA",56);
        employeeService.addEmployee(8,"Rimesh","React Developer",82);
        employeeService.addEmployee(9,"Krishna","UI/UX",10);
        employeeService.deleteEmployee(5);
        employeeService.updateEmployee(1,"Anisha Khatiwada","Java Developer",15);
        employeeService.updateEmployee(2,"Kaushal Ghimire","Full Stack Developer",23);
    }
}
