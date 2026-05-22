import java.util.*;

public class Graph {
    private Map<Integer, List<int[]>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }


    public void addEdge(int from, int to) {
        addEdge(from, to, 1);
    }

    public void addEdge(int from, int to, int weight) {
        adjList.get(from).add(new int[]{to, weight});
    }

    public void printGraph() {
        for (int v : adjList.keySet()) {
            System.out.print(v + ": ");
            for (int[] edge : adjList.get(v)) {
                System.out.print(edge[0] + "(w=" + edge[1] + ") ");
            }
            System.out.println();
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int[] edge : adjList.get(current)) {
                int neighbor = edge[0];
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    private void dfsHelper(int v, Set<Integer> visited) {
        visited.add(v);
        System.out.print(v + " ");

        for (int[] edge : adjList.get(v)) {
            int neighbor = edge[0];
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void dijkstra(int start) {
        int n = adjList.size();
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int v = 0; v < n; v++) {
                if (!visited[v] && (u == -1 || dist[v] < dist[u])) {
                    u = v;
                }
            }

            if (dist[u] == Integer.MAX_VALUE) break;

            visited[u] = true;


            for (int[] edge : adjList.get(u)) {
                int neighbor = edge[0];
                int weight = edge[1];
                if (dist[u] + weight < dist[neighbor]) {
                    dist[neighbor] = dist[u] + weight;
                }
            }
        }


        System.out.println("Dijkstra from vertex " + start + ":");
        for (int v = 0; v < n; v++) {
            String distStr = (dist[v] == Integer.MAX_VALUE) ? "unreachable" : String.valueOf(dist[v]);
            System.out.println("  Vertex " + v + " -> distance: " + distStr);
        }
    }
}