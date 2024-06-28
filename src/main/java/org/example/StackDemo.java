package org.example;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.peek());

        List<String> stackTwo = new Stack<>();

        stackTwo.add("Miur");
        stackTwo.add("James");
        stackTwo.add("John");

        System.out.println(stackTwo);
    }
}
