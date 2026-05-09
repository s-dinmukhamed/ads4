public class Experiment {
    public void runTraversals(Graph g){
        long start = System.nanoTime();
        g.bfs(0);
        long end = System.nanoTime();


        start = System.nanoTime();
        g.dfs(0);
        end = System.nanoTime();

    }

    public void runMultipleTests(){
        int[] sizes = {10, 30, 100};

        for(int size : sizes) {
            System.out.println("Graph size: " + size);

            Graph g = new Graph();

            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }
            for (int i = 0; i < size - 1; i++) {
                g.addEdge(i, i + 1);
            }
            runTraversals(g);
        }
    }

    public void printResults(){
        System.out.println("\nResults printed above.");
    }
}
