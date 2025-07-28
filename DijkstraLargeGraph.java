
public class DijkstraLargeGraph {

    public static void main(String[] args) {
        String filename = "realWorldGraph.txt";
        String startVertex = "Dublin";

        Graph graph = new Graph(filename);

        long startTime = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long startMemory = runtime.totalMemory() - runtime.freeMemory();

        GraphAlgorithms.DijkstrasAlgorithm(graph, startVertex);

        long endTime = System.nanoTime();
        long endMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("\nExecution time: " + (endTime - startTime) / 1_000_000 + " ms");
        System.out.println("Memory used: " + (endMemory - startMemory) / 1024 + " KB");
    }
}