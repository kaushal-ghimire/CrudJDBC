package com.kaushal.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleList {

    public static void main(String[] args){
        // upcasting -> creating object of child class to the reference of parent class.
        List<String> list = new LinkedList<String>();//creating linked list

        //adding object in linked list
        list.add("Kaushal Ghimire");
        list.add("Ramesh Gautam");
        list.add("Anisha Khatiwada");
        list.remove(2);

        //traversing list through iterator
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
        //creating object in array list
        List<Integer> list1 = new ArrayList<Integer>();

        //adding object in array list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.remove(1);

        //traversing list through iterator
        Iterator<Integer> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
