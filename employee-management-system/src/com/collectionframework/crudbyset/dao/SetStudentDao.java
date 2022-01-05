package com.collectionframework.crudbyset.dao;

import com.collectionframework.crudbyset.dto.SetStudent;

public interface SetStudentDao{

    public abstract SetStudent addStudent(int id, String name,String address,long phoneNum);
    public abstract SetStudent deleteStudent(int id);
    public static final String URL = "jdbc:mysql://localhost:3306/collection";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "mysqlkaushal@12";
}
