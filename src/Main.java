public class Main {

    public static void main(String[] args) {

        runTest(10, true);   // small
        runTest(30, false);  // medium
        runTest(100, false); // large

        runDijkstraDemo();
    }

    private static void runTest(int size, boolean printTraversal) {
        Graph g = new Graph();
        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {
            g.addEdge(i, i + 1);
        }

        System.out.println("\nGraph size: " + size);

        // BFS
        long start = System.nanoTime();
        if (printTraversal) {
            System.out.print("BFS: ");
            g.bfs(0);
            System.out.println();
        } else {
            g.bfs(0);
        }
        long end = System.nanoTime();
        System.out.println("BFS time: " + (end - start));

        // DFS
        start = System.nanoTime();
        if (printTraversal) {
            System.out.print("DFS: ");
            g.dfs(0);
            System.out.println();
        } else {
            g.dfs(0);
        }
        end = System.nanoTime();
        System.out.println("DFS time: " + (end - start));
    }

    private static void runDijkstraDemo() {
        System.out.println("\n=== Bonus: Dijkstra's Algorithm ===");

        Graph g = new Graph();
        for (int i = 0; i < 5; i++) {
            g.addVertex(new Vertex(i));
        }

        g.addEdge(0, 1, 4);  g.addEdge(1, 0, 4);
        g.addEdge(0, 2, 2);  g.addEdge(2, 0, 2);
        g.addEdge(1, 3, 7);  g.addEdge(3, 1, 7);
        g.addEdge(2, 3, 1);  g.addEdge(3, 2, 1);
        g.addEdge(2, 4, 5);  g.addEdge(4, 2, 5);
        g.addEdge(3, 4, 3);  g.addEdge(4, 3, 3);

        System.out.println("\nGraph adjacency list:");
        g.printGraph();

        System.out.println();
        g.dijkstra(0);


    }
}