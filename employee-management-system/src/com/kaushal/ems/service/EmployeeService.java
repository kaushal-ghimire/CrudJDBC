package com.kaushal.ems.service;

import com.kaushal.ems.dto.Employee;
import com.kaushal.ems.exceptions.EmployeeNotFoundExceptions;

import java.util.List;

public interface EmployeeService {
    public abstract void addEmployee(int empId, String empName, String designation, int daysAttended);
    public abstract void deleteEmployee(int empId);
    public abstract void updateEmployee(int empId, String empName, String designation, int daysAttended);
    public abstract Employee findEmployee(int empId, String empName, String designation, int daysAttended) throws EmployeeNotFoundExceptions;
    public List<Employee> showAllEmployees();

}
