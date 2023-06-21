package com.start;

import java.util.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        String str = "green apple";
        CharFinder finder = new CharFinder();
        var result = finder.findFirstRepeatedChar(str);
        System.out.println(result);
    }


    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
