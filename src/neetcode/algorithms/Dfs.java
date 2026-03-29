package neetcode.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Dfs {
    private Map<Integer, ArrayList<Integer>> adjList = new HashMap<>();

    public void dfsIterative(int startNode) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.add(startNode);
        visited.add(startNode);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(node);

            // explore the neighbors
            for(int neighbour: adjList.getOrDefault(node, new ArrayList<>())) {
                if(!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    stack.add(neighbour);
                }
            }
        }
    }

    public void dfsRecursive(int startNode) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(startNode, visited);
    }

    public void dfsHelper(int startNode, Set<Integer> visited) {
        visited.add(startNode);
        System.out.println(startNode);
        for(int neighbour: adjList.getOrDefault(startNode, new ArrayList<>())) {
            if(!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited);
            }
        }
    }
}
