package common;

public class SeqPattern {
    public static void main(String[] args) {
        printSequence(5);
    }

    private static void printSequence(int size) {
        for(int i = 0; i <= size; i++){
            int printValue = 0;
            for(int j = 0; j < i; j++){
                System.out.print(++printValue + "\t");
            }
            System.out.println();
        }
    }
}
