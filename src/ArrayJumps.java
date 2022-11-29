enum POSITION {
    LEFT, RIGHT;
}

public class ArrayJumps {

    public static void main(String[] args) {

        System.out.println(new ArrayJumps().arrayJumps(new int[]{3, 2, 3, 4, 5}, 1, 4));

    }

    public int arrayJumps(int A[], int S, int X) {


        if (A.length == 0) return 0;

        if (S > A.length || S < 1) return S;

        int oddOrEven = 1;

        int nextIndex = 0;

        int result = S;

        while (true) {


            if (oddOrEven % 2 == 0)
                nextIndex = findElement(A, S, POSITION.RIGHT);
            else
                nextIndex = findElement(A, S, POSITION.LEFT);

            if (nextIndex == -1) return result;
            else {
                result = nextIndex;
                A[S] = A[S] + X;
                S = nextIndex;
            }

            oddOrEven++;
        }

    }

    public int findElement(int A[], int s, POSITION pos) {

        if (s < 0 || s > A.length) return -1;

        int start = 0, end = 0;


        if (POSITION.LEFT == pos) {
            start = 0;
            end = s - 1;

            for (int i = end; i >= start; i--) {
                if (A[s] == A[i] - 1) return i;
            }

        } else {
            start = s + 1; // 1
            end = A.length - 1; // 4

            for (int i = start; i <= end; i++) { // i = 1
                if (A[s] == A[i] - 1) return i;
            }
        }

        return -1;
    }


    /*

    {}, go to left or right

    if(not found) return -1;

    if(odd) goto left
    else go to right

    for()




     */
}


/**
 You are given an array A containing N integers, and a starting position S, as well as offset integer X.

 You need to identify the final position of a jumping game which has the following rules:

 In every odd round, you jump left from current position (C) to the closest position CL, such that A[CL] = A[C] + 1.
 In every even round, you jump right from current position (C) to the closest position CR, such that A[CR] = A[C] + 1.
 if there is no valid position for the next jump, stop jumping and return the position C.
 After a successful jump (odd or even), the array value at the position before the jump (C) is incremented by X, i.e. A[C] := A[C] + X. Then proceed to the next round at the new position (CL/CR).
 Write a method arrayJumps(A, S, X), which returns the position where you end after performing all suitable jumps.

 Examples:

 arrayJumps(A = [3, 2, 3, 4, 5], S = 1, X = 4) -> 3

 C               C                           C
 [3, 2, 3, 4, 5] -> [3, 6, 3, 4, 5] -> [7, 6, 3, 4, 5]

 arrayJumps(A = [1, 3, 1], S = 1, X = 2) -> 1

 Array A is indexed from 0 in the examples.
 Initial values in the array A are positive integers between 1 and N, where N is the length of the array A.


 arrayJumps(A = [3, 2, 3, 4, 5], S = 1, X = 4) -> 3

 */

