import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class GraphDS {

    private static final HashMap<Integer, int[]> graph = new HashMap<>();

    public static void main(String... args) {

        addVertices(4);

        addVertices(6);

        addVertices(7);

        addVertices(3);

        addConnection(4, 6);

        addConnection(4, 7);

        addConnection(6, 7);

        addConnection(7, 3);

        printConnections();

    }

    private static void addVertices(Integer vertices) {

        graph.put(vertices, null);

    }

    private static void addConnection(int vertices1, int vertices2) {

        if (graph.get(vertices1) != null) {

            int[] currentEdges = Arrays.copyOf(graph.get(vertices1), graph.get(vertices1).length + 1);
            currentEdges[currentEdges.length - 1] = vertices2;
            graph.put(vertices1, currentEdges);
        } else {
            graph.put(vertices1, new int[]{vertices2});
        }

        if (graph.get(vertices2) != null) {

            int[] currentEdges = Arrays.copyOf(graph.get(vertices2), graph.get(vertices2).length + 1);
            currentEdges[currentEdges.length - 1] = vertices1;
            graph.put(vertices2, currentEdges);
        } else {
            graph.put(vertices2, new int[]{vertices1});
        }
    }


    private static void printConnections() {
        Set<Map.Entry<Integer, int[]>> entrySet = graph.entrySet();

        for (Map.Entry<Integer, int[]> eachNode : entrySet) {
            System.out.println(String.format("Node %s -> %s", eachNode.getKey(), printArray(eachNode.getValue())));
        }
    }

    private static String printArray(int[] value) {
        if (value == null) return null;

        StringBuilder stringBuilder = new StringBuilder();

        for (int eachVal : value)
            stringBuilder.append(" ").append(eachVal);
        return stringBuilder.toString();

    }


}
