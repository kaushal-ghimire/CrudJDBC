package com.kaushal.ems.dao;

import com.kaushal.ems.dto.Employee;
import com.kaushal.ems.exceptions.EmployeeNotFoundExceptions;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    private Connection cn = null;
    private PreparedStatement statements = null;
    private ResultSet result = null;

    public static final String INS_COMMAND = "INSERT INTO employee VALUES(?,?,?,?)";
    public static final String UPDATE_COMMAND = "UPDATE employee SET empName=?,designation=?,daysAttended=? WHERE empID=?";
    public static final String DELETE_COMMAND = "DELETE FROM employee WHERE empId=?";
    public static final String FIND_COMMAND = "SELECT *FROM employee WHERE empID=?";
    public static final String SELECT_ALL = "SELECT *FROM employee";

    public EmployeeDAOImpl() {
        try {
            cn = DriverManager.getConnection(EmployeeDAO.URL,EmployeeDAO.USERNAME,EmployeeDAO.PASSWORD);
        } catch (SQLException e) {
            System.out.println("Unable to establish a connection with database");
            e.printStackTrace();
        }
    }

    @Override
    public void addEmployee(int empId, String empName, String designation, int daysAttended) {
        int i = 0;

        try {
            statements = cn.prepareStatement(INS_COMMAND);
            statements.setInt(1,empId);
            statements.setString(2,empName);
            statements.setString(3,designation);
            statements.setInt(4,daysAttended);
            i= statements.executeUpdate();
        } catch (SQLException e1) {
            if(i == empId) {
                System.out.println("Adding Command failed.");
                e1.printStackTrace();
            }
        }finally {
            try {
                statements.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        if(i>1){
            System.out.println("Record Added.");
        }
    }

    @Override
    public void deleteEmployee(int empId) {
        int i = 0;
        try {
            statements = cn.prepareStatement(DELETE_COMMAND);
            statements.setInt(1, empId);
            i= statements.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }finally{
            try {
                statements.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        if(i>0){
            System.out.println("Record deleted successfully.");
        }
    }

    @Override
    public void updateEmployee(int empId, String empName, String designation, int daysAttended) {
        int i = 0;

        try {
            statements = cn.prepareStatement(UPDATE_COMMAND);
            statements.setInt(1,empId);
            statements.setString(2,empName);
            statements.setString(3,designation);
            statements.setInt(4,daysAttended);
            i= statements.executeUpdate();
        } catch (SQLException e1) {
            System.out.println("Update Command failed.");
            e1.printStackTrace();
        }finally {
            try {
                statements.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        if(i>0){
            System.out.println("Record updated successfully.");
        }
    }

    @Override
    public Employee findEmployee(int empId, String empName, String designation, int daysAttended) throws EmployeeNotFoundExceptions {
        Employee findTemp =null;
        try {
            statements = cn.prepareStatement(FIND_COMMAND);
            statements.setInt(1, empId);
            result = statements.executeQuery();
            if (!result.next()){
                throw new EmployeeNotFoundExceptions(empId);
            }
            findTemp = new Employee();
            findTemp.setEmpName(result.getString("EmpName"));
            findTemp.setDesignation(result.getString("Designation"));
            findTemp.setDaysAttended(result.getInt("DaysAttended"));
            findTemp.setEmpId(result.getInt(empId));
        } catch (SQLException e1) {
            e1.printStackTrace();
        }finally {
            try {
                statements.close();
                result.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Employee> showAllEmployees() {
        Employee selectAllEmployee = null;
        List<Employee> list = new LinkedList<>();
        try {
            statements = cn.prepareStatement(SELECT_ALL);
            result = statements.executeQuery();
            while(result.next()){
                selectAllEmployee = new Employee();
                selectAllEmployee.setEmpId(result.getInt("EmpId"));
                selectAllEmployee.setEmpName(result.getString("empName"));
                selectAllEmployee.setDesignation(result.getString("Designation"));
                selectAllEmployee.setDaysAttended(result.getInt("daysAttended"));
                list.add(selectAllEmployee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                statements.close();
                result.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
