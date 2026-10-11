package com.ga.homework;

import java.util.Stack;

public class ReverseStack {
    public static void insert(Stack<Integer> stack, int value){
        //if its empty, add values to it
        if (stack.isEmpty()){
            stack.push(value);
            return;
        }
        //save the top element
        int top= stack.pop();
        //add the value
        // will call top
        insert(stack,value);
        //push it to the stack
        stack.push(top);

    }

    public static void reverse(Stack<Integer> stack){
//        Reverse the elements of a stack using only stack operations (push and pop).
//        Method Implementation: Implement a method to reverse
//        the stack without using any additional data structures.
        if (stack.isEmpty()){
            return;
        }

        int top= stack.pop(); //the top stack
        reverse(stack);
        insert(stack,top);

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(20);
        stack.push(40);
        stack.push(60);

        System.out.println("before: "+stack);
        reverse(stack);
        System.out.println("after: "+stack);

    }

}
