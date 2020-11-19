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


}
