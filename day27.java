import java.util.*;

public class ShortestPath {
    public static int shortestPath(int V, int[][] edges, int start, int end) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]); // undirected
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        q.add(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == end) return dist[node];
            for (int nei : graph.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    dist[nei] = dist[node] + 1;
                    q.add(nei);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{0,2},{1,3},{2,3},{3,4}};
        int start = 0, end = 4;
        System.out.println(shortestPath(V, edges, start, end)); // Output: 3
    }
}


Problem : Find the Shortest Path in an Unweighted Graph
You are given an unweighted graph represented by an adjacency list. Your task is to find the shortest path (in terms of the number of edges) between two given nodes in the graph.

Input :
* An integer V representing the number of vertices in the graph.
* A list of edges, where each edge connects two vertices of the graph.
* Two integers, start and end, representing the source and destination nodes respectively.
* V = 5, Edges = [[0, 1], [0, 2], [1, 3], [2, 3], [3, 4]], start = 0, end = 4

Output :
Return the shortest path length (number of edges) from start to end. If there is no path, return -1.
Output: 3
