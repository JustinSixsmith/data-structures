package com.start;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var numbers = new LinkedList();
        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        System.out.println(numbers.getKthFromTheEnd(3));
    }
}
