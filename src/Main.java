import ds.Queue;
import ds.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);
        queue.enqueue(21);
        queue.enqueue(33);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
    }
}