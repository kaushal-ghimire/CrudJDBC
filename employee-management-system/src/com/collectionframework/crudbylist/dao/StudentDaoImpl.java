package com.collectionframework.crudbylist.dao;

import com.collectionframework.crudbylist.dto.Student;



import java.sql.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {

    private Connection conn = null;
    private PreparedStatement stat = null;
    private ResultSet res = null;

    public static final String INS_COMMAND = "INSERT INTO student_list VALUES(?,?,?)";
//    public static final String DELETE_COMMAND = "DELETE FROM student_list WHERE roll = ?";
//    public static final String UPDATE_COMMAND = "UPDATE student_list SET first_name=? , last_name=? WHERE roll = ?";
//    public static final String FIND_COMMAND = "SELECT *FROM student_list where roll = ?";
//   // public static final String SELECT_COMMAND = "SELECT *FROM student_list";
    public StudentDaoImpl() {
        try {
            conn = DriverManager.getConnection(StudentDAO.URL,StudentDAO.USERNAME,StudentDAO.PASSWORD);
        } catch (SQLException e) {
            System.out.println("Unable to establish a connection with database");
            e.printStackTrace();
        }
    }

    @Override
    public Student addStudent(int roll, String firstname, String lastname) {
        int i = 0;

        try {
            stat = conn.prepareStatement(INS_COMMAND);
            List<Student> list = new LinkedList<Student>();
            list.add(new Student(roll,firstname,lastname));

            Iterator<Student> iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
                stat.setInt(1,roll);
                stat.setString(2,firstname);
                stat.setString(3,lastname);
                stat.executeQuery();
            }

        } catch (SQLException e) {
            if(i == roll) {
                System.out.println("Adding Student Failed");
                e.printStackTrace();
            }
        }
        finally {
            try{
                stat.close();
            }catch(SQLException e1){
                e1.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Student deleteStudent(int roll) {
//        int i = 0;
//        try {
//            stat = conn.prepareStatement(DELETE_COMMAND);
//            List<Student> list = new LinkedList<Student>();
//            Iterator<Student> iterator = list.iterator();
//            while(iterator.hasNext()){
//                System.out.println(iterator.next());
//                stat.setInt(1,roll);
//                stat.executeUpdate();
//            }
//        } catch (SQLException e) {
//            System.out.println("User Deletion Failed");
//            e.printStackTrace();
//        }finally {
//            try {
//                stat.close();
//            } catch (SQLException e1) {
//                e1.printStackTrace();
//            }
//        }
        return null;
    }


    @Override
    public Student updateStudent(int roll, String firstname, String lastname) {
//        try {
//            stat = conn.prepareStatement(UPDATE_COMMAND);
//            List<Student> list = new LinkedList<Student>();
//            Iterator<Student> iterator = list.iterator();
//            while(iterator.hasNext()){
//                System.out.println(iterator.next());
//                stat.setInt(1,roll);
//                stat.setString(2,firstname);
//                stat.setString(3,lastname);
//                stat.executeUpdate();
//            }
//        } catch (SQLException e) {
//            System.out.println("Updated successfully");
//            e.printStackTrace();
//        }finally {
//            try {
//                stat.close();
//            } catch (SQLException e1) {
//                e1.printStackTrace();
//            }

        return null;
    }

    @Override
    public Student findStudent(int roll, String firstname, String lastname) {
        Student findStudent = null;
//        try {
//            stat = conn.prepareStatement(FIND_COMMAND);
//            stat.setInt(1,roll);
//            res = stat.executeQuery();
//
//            findStudent = new Student();
//            findStudent.setFirstName(res.getString(firstname));
//            findStudent.setLastName(res.getString(lastname));
//            findStudent.setRollNo(res.getInt(roll));
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    @Override
    public List<Student> showAllStudent() {
        String selectAllStudent= null;
        List<Student> list = new LinkedList<Student>();

        return null;
    }
}
