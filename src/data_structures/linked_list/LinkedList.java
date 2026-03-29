package data_structures.linked_list;

/**
 * Implement a linked list with the following functionalities
 * - Add an element to the linked list
 * - Remove an element to the linkedlist
 * - print all the elements of the linked list
 * - size of the linked list
 * - if linked list contains some element
 */

public class LinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // adding an element into the linked list
    public void add(int data) {
        // if list is already empty
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        // if not empty
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

        // increase size
        size++;
    }

    // remove an element from the linked list
    public void remove(int data) {
        // if list is empty
        if (head == null) {
            size--;
            return;
        }

        // if head contains the data to be removed
        if (head.data == data) {
            size--;
            head = head.next;
            return;
        }

        // if the element is in between
        Node currentNode = head;
        if (currentNode.next != null && currentNode.data == data) {
            currentNode = currentNode.next;
        }

        currentNode.next = currentNode.next.next;

        size--;

    }

    // get the size of the linked list
    public int size() {
        return this.size;
    }

    // print all elements of the linkedList
    public void display() {
        Node currentHead = head;
        while (currentHead != null) {
            System.out.print(currentHead.data + " -> ");
            currentHead = currentHead.next;
        }
        System.out.println(" ");
    }
}