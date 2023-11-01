public class IndexInFibonacciSeries {

    // return the index of an element from a fibonacci series.
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

    static int indexOfFIbNumber = 0;

    public static void main(String[] args) {
        // System.out.printf("Index of Fib number: %d and exact/closest match is %d %n", indexOfFIbNumber, indexOfFibonacciNumber(6, 0, 1));
        // above line prints a bug, indexOfFIbNumber is always 0. denug and see. because printf() would have eveluated the value
        // before indexOfDFibonacciNumber is eveluated. fix for the same is below.

        System.out.printf("Closest match of Fib number: %d and index of match is %d %n", indexOfFibonacciNumber(6, 0, 1), indexOfFIbNumber);
    }

    public static int indexOfFibonacciNumber(int aNumber, int previousFib, int currentFib) {

        indexOfFIbNumber++;

        int nextFibNumber = previousFib + currentFib;

        if (nextFibNumber >= aNumber) return nextFibNumber;

        return indexOfFibonacciNumber(aNumber, currentFib, nextFibNumber);
    }

}
