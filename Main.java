import data_structures.linked_list.LinkedList;
import implementations.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.peek());
        queue.display();

        queue.remove();

        queue.display();
    }
}
