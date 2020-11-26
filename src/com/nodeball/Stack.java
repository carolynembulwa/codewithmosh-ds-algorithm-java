package com.nodeball;


import java.util.Arrays;
import java.util.List;

public class Stack {

    //Stack
    //Last in first out
    //STack can be implemented using arrays or linkedlist
    //all oparations run in o(1)

    //push -  add an item on top of the stack 0(1)
    //pop -  remove an item on top of the stack 0(1)
    //peek - return the last item without removing from stack 0(1)
    //empty -  checks if stack is empty

    java.util.Stack<Integer> stack = new java.util.Stack<>();
    private List<Character> rightBrackets = Arrays.asList(')','>',']','}');
    private List<Character> leftBrackets = Arrays.asList('(','<','[','{');

    private int[] items = new int[5];
    private int count;
    public String reverse(String input){

        //Reverse a string
        // iput: abcd
        //output : dcba
        if(input == null){
            throw  new IllegalArgumentException();
        }
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }

        StringBuffer reversed = new StringBuffer();

        while (! stack.empty()){
            reversed.append(stack.pop());
        }
        return  reversed.toString();
    }

    public boolean  balancedExpression(String exprression){
        if(exprression == null){
            throw new IllegalArgumentException();
        }
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(char ch : exprression.toCharArray()){

            if(isLeftBracket(ch)) {
                stack.push(ch);
            }
            if(isRightBracket(ch)){
                if(stack.empty()){
                    return false;
                }
                var top = stack.pop();
                if(!bracketsMatch(top, ch)){
                    return false;
                }
            }

        }

        return  stack.empty();

    }

    private  boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private  boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right ){
       return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);

    }

    /*Build Stack using Array Start*/
    public void addstack( int item){
        stack.push(item);
        if(count == items.length){
            throw  new StackOverflowError();
        }
        items[count++] = item;
    }

    public int popStack(){
        stack.pop();
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[--count];

    }

    public int peekStack(){
       // return stack.peek();
        if(count == 0){
              throw new IllegalStateException();
        }
        return items[count - 1];
    }

    public boolean isEmpty(){
        return  count==0;
    }
    /*Build Stack using Array End*/

    public java.util.Stack sort () {
        // 3. Given a stack, sort the elements in the stack using one additional stack.
        //
        //eg.
        //
        //sort([1, 3, 2, 4]) = [1, 2, 3, 4]

        //empty || null

        if(stack == null){
            throw new IllegalArgumentException();
        }
        //newstack which handle sorted data
        // temp  = 3

        java.util.Stack<Integer> sortedStack = new java.util.Stack<>();
         sortedStack.push(stack.pop());

         while(!stack.isEmpty()){
         int temp = stack.pop();
          while(!sortedStack.isEmpty() && temp > sortedStack.peek()){
          stack.push(sortedStack.pop());
         }
         sortedStack.push(temp);

         }
        return sortedStack;

    }







}
