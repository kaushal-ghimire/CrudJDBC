package com.kaushal.ems.service;

import com.kaushal.ems.dao.EmployeeDAO;
import com.kaushal.ems.dao.EmployeeDAOImpl;
import com.kaushal.ems.dto.Employee;
import com.kaushal.ems.exceptions.EmployeeNotFoundExceptions;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeDAO empDao = new EmployeeDAOImpl();

    @Override
    public void addEmployee(int empId, String empName, String designation, int daysAttended) {
            empDao.addEmployee(empId,empName, designation,daysAttended);
    }

    @Override
    public void deleteEmployee(int empId) {
    empDao.deleteEmployee(empId);
    }

    @Override
    public void updateEmployee(int empId, String empName, String designation, int daysAttended) {
        empDao.updateEmployee(empId,empName,designation,daysAttended);
    }

    @Override
    public Employee findEmployee(int empId, String empName, String designation, int daysAttended) throws EmployeeNotFoundExceptions {
        return empDao.findEmployee(empId,empName,designation,daysAttended);
    }

    @Override
    public List<Employee> showAllEmployees() {
        return empDao.showAllEmployees();
    }
}
