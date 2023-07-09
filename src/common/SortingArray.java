package common;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,2,7,8,10,9,11};
        int[] sortedArray = sortArray(array);
        //System.out.println(sortedArray.length);
        //Arrays.asList(sortedArray).forEach(element -> { System.out.print(element + "\t");});
         for(int i = 0; i < sortedArray.length; i++)
              System.out.print(sortedArray[i]+ "\t");
    }

    private static int[] sortArray(int[] array) {
        for(int i = 1; i < array.length; i++){
            if(array[i-1] > array[i]){
                int value = array[i];
                array[i] = array[i-1];
                array[i-1] = value;
                i=0;
            }
        }
        return array;
    }
}
