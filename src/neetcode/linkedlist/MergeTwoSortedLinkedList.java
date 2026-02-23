package neetcode.linkedlist;

public class MergeTwoSortedLinkedList {
    public Node mergeTwoSortedList(Node list1, Node list2) {
        Node newList = new Node(0);
        Node currentNode = newList;
        while(list1 != null && list2 != null) {
            if(list1.data > list2.data) {
                currentNode.next = list2;
                list2 = list2.next;
            } else {
                currentNode.next = list1;
                list1 = list1.next;
            }
            currentNode = currentNode.next;
        }

        if(list1 != null) {
            currentNode.next = list1;
        } else {
            currentNode.next = list2;
        }

        return newList.next;
    }
}
