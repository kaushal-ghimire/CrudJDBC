package com.collectionframework.crudbyset.dao;

import com.collectionframework.crudbyset.dto.SetStudent;


import java.sql.*;
import java.util.*;

public class SetStudentDaoImpl implements SetStudentDao{

    Connection connect = null;
    PreparedStatement prepareStat = null;
    ResultSet result = null;

    public static final String INS_COMMAND = "INSERT INTO student_set VALUES(?,?,?,?)";
    public static final String DELETE_COMMAND = "DELETE FROM student_set where id = ?";
    public SetStudentDaoImpl(){
        try {
            connect = DriverManager.getConnection(SetStudentDao.URL,SetStudentDao.USERNAME,SetStudentDao.PASSWORD);
        } catch (SQLException e) {
            System.out.println("unable to connect to a database");
            e.printStackTrace();
        }
    }

    @Override
    public SetStudent addStudent(int id, String name, String address, long phoneNum) {
        int i = 0;
        try {
            prepareStat = connect.prepareStatement(INS_COMMAND);
            Set<SetStudent> sets = new HashSet<SetStudent>();
            sets.add(new SetStudent(id,name,address,phoneNum));
            Iterator<SetStudent> iterator = sets.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
                prepareStat.setInt(1,id);
                prepareStat.setString(2,name);
                prepareStat.setString(3,address);
                prepareStat.setLong(4,phoneNum);
                prepareStat.executeUpdate();
            }
        } catch (SQLException e) {
            if(e.getErrorCode() == id){
                System.out.println("Student Already Added");
                e.printStackTrace();
            }
        }
        return null;
    }

    public SetStudent deleteStudent(int id){
        try {
            prepareStat = connect.prepareStatement(DELETE_COMMAND);
            Set<SetStudent> sets = new HashSet<SetStudent>();
            Iterator<SetStudent> iterator = sets.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
                prepareStat.setInt(1,id);
                prepareStat.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
