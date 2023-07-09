package arrays_ex;

import helper.ArrayHelper;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = ArrayHelper.getIntegerArray();
        int max = findLargestElement(array);
        System.out.println("Max : " + max);
    }

    private static int findLargestElement(int[] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i])
            max = array[i];
        }
        return max;
    }
}
