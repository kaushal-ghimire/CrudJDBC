package com.collectionframework.crudbylist.main;

import com.collectionframework.crudbylist.dto.Student;
import com.collectionframework.crudbylist.dao.StudentDAO;
import com.collectionframework.crudbylist.dao.StudentDaoImpl;

public class StudentMain extends Student {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDaoImpl();

        //add student
        studentDAO.addStudent(1,"Kaushal","Ghimire");
        studentDAO.addStudent(2,"Anisha","Khatiwada");
        studentDAO.addStudent(3,"Ramesh","Gautam");
        studentDAO.addStudent(4,"Bikash","Shah");
        studentDAO.addStudent(5,"Bishal","Ghimire");

        //delete student
        studentDAO.deleteStudent(2);

        //update student
        studentDAO.updateStudent(1,"Anisha","Ghimire");
        studentDAO.updateStudent(4,"Hareram","Kamat");


        //find student
//        studentDAO.findStudent(2,"Anisha","Khatiwada");
    }
}
