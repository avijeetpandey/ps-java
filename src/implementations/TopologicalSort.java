package implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort {
    private Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();
    int V;

    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V+1];


        for(int i = 1; i<= V; i++) {
            if(!visited[i]) {
                topologicalSortHelper(i, visited, stack);
            }
        }

        // pop the stack
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public void topologicalSortHelper(int node, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;

        for(int neighbour: adjList.getOrDefault(node, new ArrayList<>())) {
            if(!visited[neighbour]) {
                topologicalSortHelper(node, visited, stack);
            }
        }

        stack.push(node);
    }
}
