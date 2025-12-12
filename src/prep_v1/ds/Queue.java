package ds;

public class Queue<T> {
    private final T[] elements;
    private final int maxSize;
    private int currentSize;
    private int front;
    private int rear;

    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.elements = (T[]) new Object[maxSize];
        this.currentSize = 0;
        this.front = 0;
        this.rear = -1;
    }

    // enqueue, adding elements to the queue
    public void enqueue(T element) {
        if(isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % maxSize;
        elements[rear] = element;
        currentSize++;
    }

    public T dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T element = elements[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return element;
    }

    public boolean isFull() {
        return (currentSize == maxSize);
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public T peek() {
        return elements[front];
    }
}
