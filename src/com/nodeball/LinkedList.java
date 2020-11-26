package com.nodeball;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    //insert at the beginning o(1)
    //insert at the middle o(n)
    //insert at the end o(1)

    //delete at the beginning o(1)
    //delete at the middle o(n)
    //delete at the end o(n)

    private Node first;
    private Node last;
    private int size;

    private  boolean isEmpty(){
        return first == null;
    }
    //addFirst
    public void addFirst(int item){
        var node =  new Node(item);
        if(isEmpty()){
            //set first and last to the new node
            first = last = node;
        }else{
            node.next = first;
            first =  node;
        }
        size++;
    }

    //addLast
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }

    //deleteFirst
    public void removeFirst(){
        //[10-> 20-> 30]
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last) {
            //set both nodes to null
            first = last = null;
        }else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    //deleteLast
    public void removeLast(){
        //[10-> 20-> 30]
        //[10->20 ->null]
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            //set both nodes to null
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }

        size--;

    }
    //get previous node
    private Node getPrevious(Node node){
        var current = first;
        while (current !=null){
            if(current.next == node){
                return current;
            }
            current = current.next;

        }
        return  null;
    }
    //contains
    public boolean contains (int item){
        //check if the items exists on the search method
        return indexOf(item) !=-1;
    }

    //indexof // search by index
    public int indexOf(int item) {
        int index = 0;
        var current = first;

        while (current != null){
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;

        }
        return index;
    }

    public int size(){
        return  size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var currenct = first;
        var index = 0;
        while (currenct != null){
            array[index++] = currenct.value;
            currenct = currenct.next;
        }
        return array;
    }

    public void reverseInPlace() {
        //Reverse a linkedist in place
        //input    [10 -> 20 -> 30]
        //out put [10 <- 20 <- 30]
        if(isEmpty()){
            return;
        }
        Node current = first.next;
        Node previous = first;
        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous =  current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;

    }

    public int getKthFromTheEnd(int kth){
        //find the Kth Node from the end of a linkedlist in one pass
        int k = kth;
        // if size is provide you can check if it is greater than size
        if(k>size){
            throw new IllegalArgumentException();
        }

        // [10 -> 20 -> 30 -> 40 -> 50 ]
        //               *          *
        //  k = 1 ( 50)
        //  k = 2 ( 40)
        //  k = 3 ( 30) ( distance of our pointer is 2)
        //  k = 4 ( 20)
        //  k = 5 ( 10)

        //check if it is empty
        if (isEmpty()) {
            throw new IllegalStateException();
        }



        Node a = first;
        Node b = first;

        for( int i = 0; i <k -1; i++){
            b = b.next;
            //if we dont know the size we  can check if b is null
            if(b == null){
                throw new IllegalArgumentException();
            }
        }
        while(b !=last){
            a = a.next;
            b = b.next;
        }
        return a.value;

    }
    public void middleInonePass(){
        //Floyd’s Cycle-finding Algorithm
        //   Find the middle of a linked list in one pass.
        //    // If the list has an even number of nodes, there would be two
        //    // middle nodes. (Note: Assume that you don’t know the size of the
        //    // list ahead of time
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        Node a = first;
        Node b = first;

        while (b !=last && b.next !=last){
            b = b.next.next;
            a = a.next;
        }
         if(b == last){
             System.out.println(a.value);
         }else{
             System.out.println(a.value + "," + a.next.value);
         }
    }


    public Node reverse(Node node){
        // 1. Given a linked list, write a function that prints
        // the nodes of the list in reverse order.
        //input    [10 -> 20 -> 30]
        //out put [30 -> 20 -> 10]

        if(isEmpty()){
            throw  new IllegalArgumentException();
        }
        Node prev = null;
        Node current = node;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        node = prev;
        return node;

    }

   // 2.Question:​ Given a linked list, determine whether
    // it contains a cycle.

    //3. Dedup Linked List
    //Question:​ Given an unsorted linked list, write a function to remove all the duplicates. eg.
    //dedup(​1​ -> ​2​ -> ​3​ -> ​2​ -> ​1​) = ​1​ -> ​2​ -> ​3

    //4. Given a linked list, write a function
    // to split the list into two equal halves. eg.
    //divide(​1​ -> ​2​ -> ​3​ -> ​4​) = ​1​ -> ​2​, ​3​ -> ​4
    //divide(​1​ -> ​2​ -> ​3​ -> ​4​ -> ​5​) = ​1​ -> ​2​ -> ​3​, ​4​ -> ​5

    //5.Nth to the Last Element
    //Question:​ Given a linked list, and an input n, write a function
    // that returns the nth-to-last element of the linked list.
    //e.g

    //list​ = ​1​ -> ​2​ -> ​3​
    // nthToLast(​list​, ​0​)  = 5
    // nthToLast(​list​, ​1​)  = 4
    // nthToLast(​list​, ​4​) = 1
    // nthToLast(​list​, ​5​) = null

    //6. Random Linked List
    //Question:​ Given a linked list where each node has
    // two pointers, one to the next node
    // and one to a random node in the list, clone the linked list.
    //e,g

    //  1​ -> ​2​ -> ​3​ -> ​4​ -> null
    //  |    |    |    |
    //  v    v    v    v
    //  3​    ​1​    ​3​    ​2




}
