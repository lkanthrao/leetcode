public class Graph {

    static int[][] graph = new int[3][3];

    static int[][] graph1 = new int[3][];

    static int indexOfGraph = 0;

//    static Graph[][] graphObject = new Graph[10][];

    public static void main(String... args) {
        addAVertex(new int[]{4, 6}, graph, 0);
        addAVertex(new int[]{3, 6}, graph, 1);
        addAVertex(new int[]{6, 9, 8}, graph1, 0);
    }

    public static void addAVertex(int[] node, int[][] graph, int index) {
        graph[index] = node;
    }
}




// Create a Graph Data structure


// IP -  {{4,6}, {4,7}, {6,7}, {7,3}, {3,9} }


// OP
// 4 -> 6, 7
// 6 -> 7
// 7 -> 3
// 3-> 9



/*

int [] graph = new int{}; // compilation error: 2D array syntax is incorrect

int indexOfGraph = 0;

public static void main(){ // compilation error: argument missing
        addAVertex(new int{4,6})
}

pubulic void addAVertex(int [][] node){
        // static issues
        graph[indexOfGraph] = node; // compilation error: type case,
        indexOfGraph++;
}
*/