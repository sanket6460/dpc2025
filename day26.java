import java.util.*;

public class CycleInGraph {
    static boolean dfs(int v, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[v] = true;
        for (int u : adj.get(v)) {
            if (!visited[u]) {
                if (dfs(u, v, visited, adj)) return true;
            } else if (u != parent) return true;
        }
        return false;
    }

    static boolean hasCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++)
            if (!visited[i] && dfs(i, -1, visited, adj)) return true;
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{1,2},{2,3},{3,4},{4,0}};
        System.out.println(hasCycle(V, edges)); // true
    }
}



Problem : Detect a Cycle in an Undirected Graph
You are given an undirected graph represented by an adjacency list. Your task is to determine if the graph contains any cycle.
A cycle is formed if you can traverse through a sequence of edges that starts and ends at the same vertex, with at least one edge in between.

Input :
* An integer V representing the number of vertices in the graph.
* A list of edges, where each edge connects two vertices of the graph.
* Input: V = 5, Edges = [[0, 1], [1, 2], [2, 3], [3, 4], [4, 0]]

Output :
Return true if the graph contains a cycle, otherwise return false.
Output: true

