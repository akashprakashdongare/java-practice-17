package common;

public class Palindrom {
    public static void main(String[] args) {
        String name = "aba";
        if(checkPalindrom(name))
         System.out.print("Its is a palindrom");
        else
         System.out.print("It is not a palindrom");
    }

    private static boolean checkPalindrom(String name) {
        String palindrom = "";
        for(int i = name.length()-1; i >= 0 ; i--)
            palindrom = palindrom + String.valueOf(name.charAt(i));
        
        return (name.equals(palindrom));
    }
}
