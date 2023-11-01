public class Recursion {

    public static void nonRecursiveFunction(int aSimpleNumber) {
        System.out.printf("Value: %d%n", aSimpleNumber);
        recursionFunction1(aSimpleNumber - 1);
    }


    public static void recursionFunction1(int aSimpleNumber) {
        System.out.printf("Value: %d%n", aSimpleNumber);
        recursionFunction2(aSimpleNumber - 1);
    }

    public static void recursionFunction2(int aSimpleNumber) {
        System.out.printf("Value: %d%n", aSimpleNumber);
        recursionFunction3(aSimpleNumber - 1);
    }

    public static void recursionFunction3(int aSimpleNumber) {
        System.out.printf("Value: %d%n", aSimpleNumber);
        recursionFunction4(aSimpleNumber - 1);
    }

    public static void recursionFunction4(int aSimpleNumber) {
        System.out.printf("Value: %d%n", aSimpleNumber);
        recursionFunction5(aSimpleNumber - 1);
    }

    public static void recursionFunction5(int aSimpleNumber) {
        System.out.printf("Value: %d%n", aSimpleNumber);
    }

    public static void demoNaiveRecursiveFunction() {
        for (int i = 5; i > -1; i--) {
            aNaiveRecursiveFunction(i);
        }
    }

    public static void aNaiveRecursiveFunction(int aSimpleNumber) {
        System.out.printf("Value: %d%n", aSimpleNumber);
    }

    public static void main(String[] args) {
        int count = 0;
        // 5 * 4 * 3 * 2 * 1
        //nonRecursiveFunction(5);
        //demoNaiveRecursiveFunction();
        aRightRecursionFunction(5);
    }

    // 3, 2, 1, 0
    public static void aRightRecursionFunction(int aSimpleNumber) {

        System.out.printf("Value: %d%n", aSimpleNumber);

        if (aSimpleNumber - 1 == -1) //stop
            return;

        aRightRecursionFunction(aSimpleNumber - 1);
    }

    // lk - below is a typical example of how a copy paste of above code with some chages assumed to work
    // but didn't
  /*  public static void aRightRecursionFunction(int aSimpleNumber) {

        if(aSimpleNumber - 1 == -1) //stop
            return;

        System.out.println(String.format("Value: %d", aSimpleNumber));

        aRightRecursionFunction(aSimpleNumber - 1);
    }*/

}