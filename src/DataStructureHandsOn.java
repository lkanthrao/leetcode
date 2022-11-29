import java.util.Map;
import java.util.PriorityQueue;

public class DataStructureHandsOn {

    public static void main(String[] args) {
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));


        //maxHeap.addAll(map.entrySet());//Adding all elements to our heap

    }
}
