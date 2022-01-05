package com.kaushal.ems.dao;

import com.kaushal.ems.dto.Employee;
import com.kaushal.ems.exceptions.EmployeeNotFoundExceptions;

import java.util.List;

public interface EmployeeDAO {
    public abstract void addEmployee(int empId, String empName, String designation, int daysAttended);
    public abstract void deleteEmployee(int empId);
    public abstract void updateEmployee(int empId, String empName, String designation, int daysAttended);
    public abstract Employee findEmployee(int empId, String empName, String designation, int daysAttended) throws EmployeeNotFoundExceptions;
    public List<Employee> showAllEmployees();

    public static final String URL = "jdbc:mysql://localhost:3306/employee";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "mysqlkaushal@12";
    public static final String DRIVER_CLASSNAME = "com.mysql.jdbc.Driver";
}
