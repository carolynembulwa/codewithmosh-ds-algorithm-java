package com.nodeball;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Queues {
    // First in firt out

    // systems that use queue
    //PRINTERS
    //Operating servers
    //web serves
    //live support systems

    // all the operations run in 0(1)
    //enqueue - add at the end
    //dequeue -  remove at the beginning
    //peek - return the top item without removing
    //isEmpty
    //isfull -

    /*Build QueUE using Circular Array Start*/
    private int[] items = new int[5];
    private int rear;
    private int count;
    private int front;
    /*Build QueUE using Circular Array Start*/


    /*Build queue using queueWithTwoStack*/
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    /*Build queue using queueWithTwoStack*/

    /*Build QueUE using Circular Array Start*/

    public void enqueue(int item){
        if(count == items.length){
            throw new IllegalArgumentException();
        }

        items[(rear + 1 ) % items.length] = item;
        count++;
    }

    public int dequeue(){
        if(count == items.length){
            throw new IllegalArgumentException();
        }

        var item = items[front];
        items[front] = 0;
         front = (front +1) % items.length;
         count --;
         return  item;

    }

    public int peek(){
        if(count == items.length){
            throw new IllegalArgumentException();
        }
        return items[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public  boolean isFull(){
        return  count == items.length;
    }

    /*Build QueUE using Circular Array end*/

    /*Build queue using queueWithTwoStack*/

    //0(1)
    public void enqueueWithTwoStack(int item){
        //stack 1 for enqueue
        //start 2 for dequeue

        stack1.push(item);

    }

    //0(n)
    public int dequeueWithTwoStack(){
        if(isEmptyWithTwoStack()){
            throw  new IllegalStateException();
        }

        moveStack1toStack2();

        return stack2.pop();
    }

    public boolean isEmptyWithTwoStack() {
        return  stack1.isEmpty() && stack2.isEmpty();
    }

    public int peekWithTwoStack(){
        if(isEmptyWithTwoStack()){
            throw  new IllegalStateException();
        }

        moveStack1toStack2();

        return stack2.peek();
    }

    private void moveStack1toStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    /*Build queue using queueWithTwoStack*/

    public static void reverseUsingStack(Queue<Integer> queue){
        //add
        //remove
        //isEmpty

        Stack<Integer> stack =  new Stack<>();


        if(queue.isEmpty()){
            throw new IllegalStateException();
        }

        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while(!stack.empty())  {
            queue.add(stack.pop());
        }
    }

    /* Priority QUEUE using Array*/
    public void addArrayPriorityQueue(int item){
        //check if the array is full
        if(count == items.length){
            throw new IllegalStateException();

        }
        int i;
        //add  items in the array in ascending order
        i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for(i = count -1; i >= 0; i--){
            if(item < items[count]){
                items[count + 1] = items[i];
            }else{
                break;
            }
        }
        return i+1;
    }

    public int removeArrayPriorityQueue(){
        if(count == 0){
            throw new IllegalStateException();

        }

       return items[ count--];
    }

    /* Priority QUEUE using Array*/

    public void QueueReverser(Queue<Integer> queue, int k) {

        // 1- Given an integer K and a queue of integers,
        // write code to reverse the order of the first K
        // elements of the queue.
        // Input:  Q = [10, 20, 30, 40, 50], K = 3
        // Output: Q = [30, 20, 10, 40, 50]
        // Solution: QueueReverser.reverse()

        if(k < 0 || k > queue.size()){
            throw new IllegalStateException();
        }
        Stack<Integer> stack = new Stack<>();
        // Dequeue the first K elements from the queue
        // and push them onto the stack
        for(int i = 0; i<k; i++){
            stack.push(queue.remove());
        }
        // Enqueue the content of the stack at the
        // back of the queue
        while(!stack.empty()){
            queue.add(stack.pop());
        }

        // Add the remaining items in the queue (items
        // after the first K elements) to the back of the
        // queue and remove them from the beginning of the queue

        for(int i = 0; i<queue.size() - k; i++){
            queue.add(queue.remove());
        }

    }

    public void LinkedListQueue() {
        // 2- Build a queue using a linked list from scratch.
        // Implement the following operations and calculate
        // their runtime complexities.
        // -enqueue -dequeue -peek -size -isEmpty
        // Solution: LinkedListQueue
    }

    //3. Build a stack using two queues.
    // Implement the following operations and calculate their
    // runtime complexities.  -push -pop  -peek -size  -isEmpty
    // Solution: StackWithTwoQueues

    //4:​ Implement a LIFO stack with basic functionality
    // (push and pop) using FIFO queues to store the data.

    //5. Implement a Priority Queue using Heap


    @Override
    public  String toString(){
        return Arrays.toString(items);
    }


}
