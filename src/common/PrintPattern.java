package common;

public class PrintPattern {
    public static void main(String[] args) {
        int size = 10;
        //printPattern(size);
        printOddPattern(size);
    }

    private static void printOddPattern(int size) {
        int printValue = 1;
        for(int i = 0; i < size && printValue < size; i++){
            for(int j = 0; j < i; j++){
                System.out.print(printValue + "\t");
                printValue = printValue + 2;
            }
            System.out.println();
        }
    }

    private static void printPattern(int size) {
        int printValue = 0;
        for(int i = 0; i < size && printValue < size; i++){
            for(int j = 0; j < i; j++){
                System.out.print(++printValue + "\t");
            }
            System.out.println();
        }
    }
}
