import java.util.*;

public class PathExistsInGraph {


    public static void main(String[] args) {
        Queue toVisitNext = new LinkedList();
        toVisitNext.add(5);

        System.out.println(isValidPath(new int[][]{{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,1},{5,4}}, toVisitNext, 8, new int[100]));


    }



        public static boolean isValidPath(int[][] edges, Queue toVisitNext, int destination, int[] visitedNodes){

            int numberOfRows = edges.length;
            int numberOfColumns = edges[0].length;

            int source = (int) toVisitNext.remove();
            visitedNodes[source] = 1;

            for(int i = 0; i< numberOfRows; i++){

                if(edges[i][0] == source)
                {
                    if(edges[i][1] == destination) return true;
                    if(visitedNodes[edges[i][1]] == 0) toVisitNext.add(edges[i][1]);
                }

                if(edges[i][1] == source) {

                    if(edges[i][0] == destination) return true;
                    if(visitedNodes[edges[i][0]] == 0) toVisitNext.add(edges[i][0]);

                }
            }

            boolean pathExists = false;

            while( !toVisitNext.isEmpty() ){
                if(isValidPath(edges, toVisitNext, destination, visitedNodes) == true) return true;
            }

            return false;
        }

}
