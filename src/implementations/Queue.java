package implementations;

/**
 * Enque -> adds element to the last of the queue
 * Dequeue -> removes element from the front of the queue
 * Peek -> First element of the queue without removing it
 */

/**
 * Java Ways
 * Queue -> Interface cant be instantiated directly
 * Queue<Integer> queue = new LinkedList();
 * Queue<Integer> dequeue = new ArrayDequeue();
 */

public class Queue {
    private static class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private QueueNode front;
    private QueueNode rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // enqueue the element
    public void add(int data) {
        /**
         * 1. create the node
         * 2. if empty add to front , front = rear
         * 3. if not point next to new node and make rear to new node
         */

        QueueNode newNode = new QueueNode(data);

        if(rear == null) {
            rear = newNode;
            front = rear;
            return;
        } 

        rear.next = newNode;
        rear = newNode;
    }

    // dequeue the element
    public int remove() {
        if(front == null) {
            throw new RuntimeException("Queue is not empty");
        }

        int data = front.data;

        front = front.next;

        if(front == null) {
            rear = null;
        }

        return data;
    }

    // display the element
    public void display() {
        QueueNode currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("");
    }

    // peek the element
    public int peek() {
        if(front == null) {
            throw new RuntimeException("Queue is empty");
        }

        return front.data;
    }
}