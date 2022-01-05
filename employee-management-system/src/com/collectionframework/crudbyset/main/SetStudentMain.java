package com.collectionframework.crudbyset.main;

import com.collectionframework.crudbyset.dao.SetStudentDao;
import com.collectionframework.crudbyset.dao.SetStudentDaoImpl;

public class SetStudentMain {
    public static void main(String[] args) {
        SetStudentDao setStudentDao = new SetStudentDaoImpl();
        setStudentDao.addStudent(1,"Sudip","Pokhara",9823456787l);
        setStudentDao.addStudent(2,"Kaushal","Biratnagar",9823456786l);
        setStudentDao.addStudent(3,"Anisha","Tanki Sinuwari",9811396276l);
        setStudentDao.addStudent(4,"Sundar","Damak",9823467834l);

        //delete from database
        setStudentDao.deleteStudent(3);
    }
}
