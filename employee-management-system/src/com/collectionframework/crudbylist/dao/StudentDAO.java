package com.collectionframework.crudbylist.dao;

import com.collectionframework.crudbylist.dto.Student;

import java.util.List;

public interface StudentDAO {
    public abstract Student addStudent(int roll,String firstname,String lastname);
    public abstract Student deleteStudent(int roll);
    public abstract Student updateStudent(int roll,String firstname,String lastname);
    public abstract Student findStudent(int roll,String firstname,String lastname);
    public abstract List<Student> showAllStudent();

    public static final String URL = "jdbc:mysql://localhost:3306/collection";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "mysqlkaushal@12";
    public static final String DRIVER_CLASSNAME = "com.mysql.jdbc.Driver";
}
