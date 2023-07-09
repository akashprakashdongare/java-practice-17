package utils;

public class PrintMessageUtil {

    public static final String line = "====================== %s ========================";

    public static void printMsg(String message){
        System.out.println();
        System.out.println(String.format(line, message));
    }
    
}
