package ds;

import ds.interfaces.StackInterface;

/**
 * - push - O(1)
 * - pop - O(1)
 * - peek - O(1)
 * - isFull and isEmpty - O(1)
 * - space complexity - O(n)
 * A stack follows LIFO structure , the last item added is removed first
 */

public class Stack<T> implements StackInterface<T> {
    private final T[] elements;
    private int top;
    private final int size;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.size = size;
        this.elements = (T[]) new Object[size];
        this.top = -1;
    }

    @Override
    public void push(T value) {
        if(isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        elements[++top] = value;
    }

    @Override
    public T pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[top--];
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == size -1;
    }
}
