# Priority Queue

Priority queue is a data structure in which elements are ordered on the base of priority , rather than the order of insertion , By Default it uses Min-Heap but custom comparators can also be used in order to define priority.

- Elements are ordered on the basis of priority , rather than insertion.
- Supports standard operations like `peek()`, `poll()` and `peek()`.
- Automatically grows as elements are added.
- Uses heap internally to make sure insertions and deletions are effecient.

```java
public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add();
    queue.peek();
    queue.poll();
}
```
