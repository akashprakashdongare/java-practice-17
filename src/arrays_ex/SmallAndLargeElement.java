package arrays_ex;

import helper.ArrayHelper;

public class SmallAndLargeElement {
    public static void main(String[] args) {
        int[] array = ArrayHelper.getIntegerArray();
        printSamallestAndLargerstElement(array);
    }

    private static void printSamallestAndLargerstElement(int[] array) {
        if(array.length > 0){
            int smallest = array[0];
            int largest = array[0];
            for(int i = 0; i < array.length; i++){
                if(smallest > array[i])
                smallest = array[i];

                if(largest < array[i])
                largest = array[i];
            }
            System.out.println("Max : " + largest);
            System.out.println("Min : " + smallest);
        } else
           System.out.println("Not found.....");
    }
}
