package com.kaushal.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args){

        //Generic Style Mapping
        Map<Integer,String> map = new HashMap<Integer,String>();

        //adding object to a hashmap
        map.put(101,"kaushal");
        map.put(102,"Ramesh");
        map.put(103,"Akash");

        //Elements can be traversed in any order
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey() + " " +m.getValue());
        }
    }
}
