package com.start;

import java.util.Stack;

public class QueueWithTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1toStack2();

        return stack2.pop();
    }

    private void moveStack1toStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1toStack2();

        return stack2.peek();
    }
}
