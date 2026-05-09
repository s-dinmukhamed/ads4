public class Main {

    public static void main(String[] args) {

        runTest(10, true);   // small
        runTest(30, false);  // medium
        runTest(100, false); // large
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
}