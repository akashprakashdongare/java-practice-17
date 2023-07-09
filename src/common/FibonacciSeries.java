package common;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacciSeries(10);
    }

    private static void printFibonacciSeries(int no) {
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 0;
        while(count < no){
            a = b;
            b = c;
            c = a + b;
            System.out.print(c + "\t");
            count++;
        }
    }
}
