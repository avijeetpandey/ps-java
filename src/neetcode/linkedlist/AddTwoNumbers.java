package neetcode.linkedlist;

public class AddTwoNumbers {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);

        Node current = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int valueOne = (l1 != null) ? l1.data : 0;
            int valueTwo = (l2 != null) ? l2.data : 0;

            int sumValue = valueOne + valueTwo + carry;

            carry = sumValue / 10;
            sumValue = sumValue % 10;
            current.next = new Node(sumValue);

            current = current.next;
            l1 = (l1 != null) ? l1.next :  null;
            l1 = (l2 != null) ? l2.next : null;
        }

        return dummy.next;
    }
}
