package implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class Graph {
    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    public void addVertex(int v) {
        adjacencyList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // for undirected graph
    }

    public void bfs(int startNode) {
        // track all visited nodes 
        // at a current node explore the neigh bour nodes and mark visited if they are already seen
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);

            for(int neighbour: adjacencyList.getOrDefault(node, new ArrayList<>())) {
                if(!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        System.out.println(" ");
    }
}
