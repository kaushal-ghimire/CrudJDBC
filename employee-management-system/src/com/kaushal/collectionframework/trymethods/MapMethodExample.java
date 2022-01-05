package com.kaushal.collectionframework.trymethods;

import java.util.HashMap;
import java.util.Map;

public class MapMethodExample {
    public static void main(String[] args) {
        Map<Integer,String> mapping = new HashMap<Integer,String>();

        mapping.put(101,"Kaushal");
        mapping.put(102,"Ajay");
        mapping.put(103,"Hareram");
        mapping.put(104,"Kamana");

        System.out.println("Hashcode: " + mapping.hashCode());

        mapping.remove(102);

        System.out.println(mapping.size());

        System.out.println(mapping.containsKey(1));

        System.out.println(mapping.get(104));
        System.out.println("Before clear collection isEmpty: " + mapping.isEmpty());
        mapping.clear();
        System.out.println("After clear collection isEmpty: " + mapping.isEmpty());


        for(Map.Entry m : mapping.entrySet()){
            System.out.println("Get key: " +m.getKey() + "," + "Get Value: " + m.getValue());
        }
    }
}
