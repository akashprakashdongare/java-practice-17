package common;

public class RecursionNoPrint {
    public static void main(String[] args) {
        printWithoutLoop(1);
    }

    private static void printWithoutLoop(int no) {
        if(no <= 10){
            System.out.print(no + "\t");
            no++;
            printWithoutLoop(no);
        }
    }
}
