public class CalculateFactorial {

    public static void main(String[] args) {

        // find factorial of a number

        System.out.printf("Factorial: %d", calculateFactorialOf(5));

    }

    public static int calculateFactorialOf(int factorialOf) {

        //  5*4*3*2*1
        // factorialOf = 5
        // (factorial - 1) * ((factorial - 1) - 1) * (((factorial - 1) - 1) - 1) * ((((factorial - 1) - 1) - 1) - 1)

        // this will fail if factorialOf = 0 so update condition
        if (factorialOf <= 1)
            return 1;

        return factorialOf * calculateFactorialOf(factorialOf - 1);
        //          5      * calculateFactorialOf(5 - 1);
        //                          4           *           calculateFactorialOf(4 - 1);
        //                                                                3                   *   calculateFactorialOf(3 - 1);
        //                                                                                                      2               *   calculateFactorialOf(2 - 1);
        //                                                                                                                                              1       *       calculateFactorialOf(1 - 1);
        //                                                                                                                                                                          0


    }
}
