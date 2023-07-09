package common;

public class PatternExample2 {
    public static void main(String[] args) {
        printOneAndZero(5);
       // printSeries(10);
    }

    private static void printSeries(int no) {
        int value = 1;
        for(int i = 0; i < no; i++){
            for(int j = 0; (j < i && value <= no); j++){
                System.out.print(value + "\t");
                value++;
            }
            System.out.println();
        }
    }

    private static void printOneAndZero(int no) {
        for(int i = 0; i < no; i++){
            for(int j = 0; j < i; j++){
                if(((i + j) % 2) == 0)
                System.out.print("1 \t");
                else
                System.out.print("0 \t");
            }
            System.out.println();
        }
    }
}
