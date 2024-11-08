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
    }
}
