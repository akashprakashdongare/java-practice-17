package arrays_ex;

import helper.ArrayHelper;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = ArrayHelper.getArray();
        int[] reversed = reverseAnArray(array);
        for(int i = 0 ; i < reversed.length; i++){
            System.out.print(reversed[i] + "\t");
        }
    }

    private static int[] reverseAnArray(int[] array) {
        int[] reversed = new int[array.length];
        int index = 0;
        for(int i = array.length - 1; i >= 0 ; i--){
            reversed[index++] = array[i];
        }
        return reversed;
    }
}
