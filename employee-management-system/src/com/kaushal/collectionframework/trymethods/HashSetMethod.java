package com.kaushal.collectionframework.trymethods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
    public static void main(String[] args) {
        Set<Integer> setup = new HashSet<Integer>();

        setup.add(1);
        setup.add(2);
        setup.add(3);
        setup.add(4);
        setup.add(5);
        setup.add(3);



        //gives the size of the set how many are added
        System.out.println(setup.size());

        //gives the contains method to search the element
        System.out.println(setup.contains(4));

      // doesn't contain get method in set type collection. Cannot resolve get in set
        // setup.get();


        System.out.println("Before Collection Clear isEmpty: " + setup.isEmpty());

        //clears the added integer in hashset to display in console
        setup.clear();

        //checks if the collection is empty
        System.out.println("After Collection Clear isEmpty: " + setup.isEmpty());

        //add all at once
        setup.addAll(setup);

        Iterator<Integer> item = setup.iterator();
        while(item.hasNext()){
            System.out.println(item.next());
        }
    }
}
