package com.nodeball;


import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    // Start Array

       /* Array numbers = new Array(10);

        numbers.insert(1);
        numbers.insert(20);
        numbers.insert(10);
        numbers.insert(70);
        numbers.mediumSortedArray();
        int middleindex =  10 / 2;
        System.out.println(middleindex);
        double middlindex =  11 / 2.0;
        System.out.println(middlindex);
        numbers.mediumSortedArray();

        numbers.insertAt(100,0);
        //numbers.removeAt(1);
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


        /*LinkedList list = new LinkedList();
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

        //list.reverse(head);
        list.toArray();
        /*list.addFirst(6);
        list.removeFirst();
        list.removeLast();

        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));*/

        //end linklist


        //start Stack

       /* java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.peek();
        stack.peek();

        Stack stack =  new Stack();
        stack.addstack(1);
        stack.addstack(2);
        stack.addstack(3);
        stack.addstack(4);
        stack.popStack();
        System.out.println(stack.peekStack());
        stack.popStack();
        System.out.println(stack.peekStack());

        stack.peekStack();

        System.out.println(stack.balancedExpression("( 1 + 2 ]"));
*/



        //end Stack


        //start QUEUE
       Queues queue = new Queues();
        queue. enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println( queue.dequeue());
        System.out.println(queue);

        //priority Queue can be done using array or heap
        //insert(2)
        //[1,3,4,5,6]

        //end QUEUE
    }
}
