package arrays_ex;

import helper.ArrayHelper;

public class CalculateSum {
    public static void main(String[] args) {
        int[] array = ArrayHelper.getArray();
        int sum = calculateSumOfElements(array);
        System.out.println("Sum of elements : " + sum);
    }

    private static int calculateSumOfElements(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
