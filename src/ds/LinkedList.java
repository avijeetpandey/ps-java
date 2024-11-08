package ds;

public class LinkedList {
    private Node head;

    public void add(int data) {
        if(head == null) {
            head = new Node(data);
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
        }
    }

    public void print() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public boolean find(int data) {
        Node currentNode = head;
        while(currentNode != null) {
            if(currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}
