package com.kaushal.collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args){
       Set<String> set = new HashSet<String>();
       set.add("Kaushal");
       set.add("Ramesh");
       set.add("Anisha");
       set.add("Kaushal");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
        Set<String> set1 = new LinkedHashSet<String>();
        set1.add("Kaushal");
        set1.add("Ramesh");
        set1.add("Anisha");
        set1.add("Kaushal");
        Iterator<String> iterator1 = set1.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
