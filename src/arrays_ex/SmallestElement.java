package arrays_ex;

import helper.ArrayHelper;

public class SmallestElement {
    public static void main(String[] args) {
        int[] array = ArrayHelper.getIntegerArray();
        int smallest = findSmallestElement(array);
        System.out.println("Samllest : " + smallest);
    }

    private static int findSmallestElement(int[] array) {
        int smallest = 0;
        if(array.length > 0){
            smallest = array[0];
            for(int i = 0; i < array.length; i++){
                if(smallest > array[i])
                smallest = array[i];
            }
        }
        return smallest;
    }
}
