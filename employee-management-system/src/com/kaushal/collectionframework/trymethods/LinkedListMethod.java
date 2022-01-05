package com.kaushal.collectionframework.trymethods;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod {
    public static void main(String[] args){
        List<String> list1 = new LinkedList<String>();

        list1.add("Aman");
        list1.add("kamal");
        list1.add("Anamika");
        list1.add("Chandra");

        list1.remove("kamal");

        System.out.println(list1.get(1));

        //traversing the element
        Iterator<String> item = list1.iterator();
        while(item.hasNext()){
            System.out.println(item.next());
        }
    }
}
