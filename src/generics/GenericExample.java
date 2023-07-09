package generics;

public class GenericExample {
    public static void main(String[] args) {

        IntegerCounter integerCounter = new IntegerCounter(1);
        integerCounter.print();

        DoubleCounter doubleCounter = new DoubleCounter(1.0);
        doubleCounter.print();

        Counter<Integer> iCounter = new Counter<>(1);
        iCounter.print();

        Counter<Double> dCounter = new Counter<>(4.0);
        dCounter.print();

    }
    
}
