package com.nodeball;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // Start Array

        Array numbers = new Array(10);

        numbers.insert(1);
        numbers.insert(20);
        numbers.insert(10);
        numbers.insert(70);
        numbers.mediumSortedArray();

        numbers.insertAt(100,0);
       /* //numbers.removeAt(1);
        System.out.println(numbers.searchArray(20));
        System.out.println(numbers.largestNumber());
        numbers.print();
        System.out.println("reverse");
        numbers.reverse();


        // dynamic array
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //remove
        list.remove(0);

        //convert to a regular array
        list.toArray();

        //search
        list.contains(1);

         */
        // end Array

        //start linkedlist

       // java.util.LinkedList  test =  new java.util.LinkedList<>();
        //test.addFirst(1);


        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(80);
        list.addFirst(90);
        list.addFirst(100);
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(10));
        System.out.println(list.contains(90));
        System.out.println(list.size());
        list.middleInonePass();
        list.reverseInPlace();
        list.reverse();
        list.toArray();
        /*list.addFirst(6);
        list.removeFirst();
        list.removeLast();

        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));*/



        //end linklist
    }
}
