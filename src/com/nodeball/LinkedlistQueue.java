package com.nodeball;

import java.util.ArrayList;

public class LinkedlistQueue {
    private class Node{
        private  int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public void enqueue(int item){
        Node node = new Node(item);
        if(head==null){
            head = tail = node;
        }else{
            tail.next = node;
            tail =node;
        }
        count++;
    }

    //0(1)
    public int dequeue(){
        if(head == null){
            throw  new  IllegalStateException();
        }
        int value = 0;

        if(head == tail){
            value = head.value;
            head = tail = null;
        }else{
            value = head.value;
            var second = head.next;
            head.next = null;
            head = second;
        }
        count--;

        return  value;

    }

    public int peek(){
        if(head == null){
            throw  new IllegalStateException();
        }
        return head.value;
    }

    public String toString(){
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
         while(current != null){
             list.add(current.value);
             current = current.next;
         }
         return list.toString();
    }
}
