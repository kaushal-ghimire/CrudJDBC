package com.kaushal.collectionframework.trymethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethodExample {
    public static void main(String[] args) {
        System.out.println("list->arraylist");
        System.out.println("----------------");
        List<String> list = new ArrayList<>();
        //adding elements to array list
        list.add("Bishal");
        list.add("Hareram");
        list.add("Kumar");
        list.add("Hareram");



        //removing elements from array list through index position
        list.remove(1);

        //set new elements/new String to the previous list of array through index position
        list.set(2,"Hari");

        //getting elements of list
        System.out.println(list.get(1));

        System.out.println(list.indexOf("Bishal"));

        System.out.println(list.lastIndexOf("Hareram"));

        list.addAll(list);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
