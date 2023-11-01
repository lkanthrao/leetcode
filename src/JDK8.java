import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface Consumer1<T> {
    void accept(T var1);

    default Consumer1<T> andThen(Consumer1<? super T> after) {
        Objects.requireNonNull(after);

        /* return new Consumer1<T>() {
            @Override
            public void accept(T var1) {
                System.out.println("Lamda's in consumer " + var1);
            }
        };*/

        Consumer1<T> consumer2 = new Consumer1<T>() {
            @Override
            public void accept(T var1) {
                System.out.println("Lamda's in consumer " + var1);
            }
        };

//        return consumer2;

        /*  Anonymous inner classes containing only one method should become lambdas. SO ABOVE CODE CAN BE TUNED AS BELOW
            Code smell
            java:S1604
        */

        Consumer1<T> consumer3 = var1 -> System.out.println("Lamda's in consumer " + var1);

//        return consumer3;

        return t -> {
            this.accept(t);
            after.accept(t);
        };
    }
}

public class JDK8 {

    public static void main(String[] args) {

        Consumer jdkConsumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("Consumer of type Object");
            }
        };

        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Consumer of type Integer " + integer);
            }
        };

//        consumer.accept("Object");
//        consumer.andThen(integerConsumer);

        Consumer1<String> consumer1 = new Consumer1() {
            @Override
            public void accept(Object var1) {
                System.out.println(var1);
            }
        };

        consumer1.accept("My Consumer");

        consumer1.andThen(myNewConsumer -> {
            System.out.println("here--- " + myNewConsumer);
        });


    }
}

