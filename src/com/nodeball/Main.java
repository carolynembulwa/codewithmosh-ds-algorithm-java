package com.nodeball;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// Start Array
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(20);
        numbers.insert(10);
        numbers.insert(70);
        //numbers.removeAt(1);
        numbers.insertAt(100,0);
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
        // end Array
    }
}
