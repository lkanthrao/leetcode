import java.util.ArrayList;
import java.util.List;

public class JumpGame {

    public static void main(String[] args) {
        int[] A = {3, 2, 5, 4, 5};
        int S = 1;
        int X = 4;
        arrayJumps(A, S, X);

        System.out.println(new ArrayJumps().arrayJumps(A,S,X));
    }

    public static void arrayJumps(int[] A, int S, int X) {
        if (S == 0 || A.length == 0) {
            System.out.println(S);
            return;
        }
        System.out.println(arrayJumps(A, S, X, 1, new ArrayList<>()));
    }

    public static int arrayJumps(int[] A, int S, int X, int round, List<Integer> result) {
        int element = A[S] + 1;
        if (round % 2 == 0) {
            for (int i = S + 1; i < A.length; i++) {
                if (element == A[i]) {
                    A[S] = A[S] + X;
                    S = i;
                    break;
                }
                if (i == A.length - 1) return S;
            }
        } else {
            for (int i = S - 1; i >= 0; i--) {
                if (element == A[i]) {
                    A[S] = A[S] + X;
                    S = i;
                    break;
                }
                if (i == 0) return S;
            }
        }
        result.add(S);
        arrayJumps(A, S, X, round + 1, result);
        return result.get(result.size() - 1);
    }
}
