package org.example.collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        /*
        Sets
         */
        //Set<String> setOfStuff = new HashSet<>();
        //Set<String> setOfStuff = new LinkedHashSet<>();
        //strings have alphabetical(natural) order
        //no duplicates in sets
        Set<String> setOfStuff = new TreeSet<>();
        setOfStuff.add("Hi");
        setOfStuff.add("Zzz");
        setOfStuff.add("Aaa");
        setOfStuff.add("Hi");
        setOfStuff.add("Hi");
        setOfStuff.add("There");
        ((NavigableSet)setOfStuff).lower("Z");
        System.out.println(setOfStuff);

        // Lists
        //can have duplicates in lists
        //List<String> listOfStuff = new ArrayList<>();
        List<String> listOfStuff = new Vector<>();
        listOfStuff.add("Hello");
        listOfStuff.add("Hello");
        listOfStuff.add("Hello");
        listOfStuff.add("Hello");
        System.out.println(listOfStuff);

        //de-duping ex. only one "Hello" when printing setOfStuff
        setOfStuff.addAll(listOfStuff);

        System.out.println(setOfStuff);

        // Queue
        //LinkedList maintains insertion order (since it's linked)
        //Queue<String> qMeUp = new LinkedList<>();
        //*Deck* Double Ended Queue
        Deque<String> qMeUp = new LinkedList<>();
        qMeUp.add("Howdy");
        qMeUp.add("Partner");
        qMeUp.offer("Yee-haw!");
        System.out.println(qMeUp);

        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("A");
        priorityQueue.add("C");
        priorityQueue.add("M");
        priorityQueue.add("B");
        System.out.println(priorityQueue);

    }
}
