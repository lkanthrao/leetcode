public class FIndMinMoves {
    public static void main(String[] args) {
        System.out.println(minMoves(19, 2));
    }

    public static int minMoves(int target, int maxDoubles) {

        int numberOfMoves = 0;

        while (target > 1) { // 19,

            if (maxDoubles == 0) {// 2
                numberOfMoves = numberOfMoves + (target - 1); // 2
                return numberOfMoves;
            }

            if (maxDoubles > 0) {// 2
                numberOfMoves++;
                numberOfMoves += target % 2; // 1,
                target = target / 2; // 19/2 = 9, 8/2 = 4
                maxDoubles--;// 1,
            }
        }

        return numberOfMoves;


    }
}
