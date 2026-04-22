package data_structures.stack;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<Integer> normalStack;
    List<Integer> minStack;

    public MinStack() {
        this.normalStack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        if(normalStack.isEmpty()) {
            normalStack.add(val);
            minStack.add(val);
        } else {
            normalStack.add(val);
            minStack.add(Math.min(this.getMin(),val));
        }
    }
    
    public void pop() {
        normalStack.removeLast();
        minStack.removeLast();
    }
    
    public int top() {
        return normalStack.getLast();
    }
    
    public int getMin() {
        return minStack.getLast();
    }
}
