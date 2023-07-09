package arrays_ex;

import helper.ArrayHelper;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = ArrayHelper.getArray();
        int secondSmallest = findSecondSmallestElement(array);
        System.out.println("Second smallest : " + secondSmallest);
    }

    private static int findSecondSmallestElement(int[] array) {
        int firstSmallest = 0;
        int secondSmallest = 0;
        if(array.length > 0){
            firstSmallest = array[0];
            secondSmallest = array[0];
            for(int i = 0; i < array.length; i++){
                if(firstSmallest > array[i]){
                    secondSmallest = firstSmallest;
                    firstSmallest = array[i];
                } else if(secondSmallest > array[i]){
                    secondSmallest = array[i];
                }
            }
        }
        return secondSmallest;
    }
}
