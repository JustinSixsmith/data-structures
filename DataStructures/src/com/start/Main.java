package com.start;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
