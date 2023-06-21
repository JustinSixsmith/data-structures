package com.start;

import javax.swing.text.html.HTML;
import java.util.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.put(6, "A+");
        table.remove(60);
        System.out.println(table.get(6));
    }


    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
