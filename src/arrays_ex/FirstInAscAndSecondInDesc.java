package arrays_ex;

import helper.ArrayHelper;

public class FirstInAscAndSecondInDesc {
    public static void main(String[] args) {
        int[] array = ArrayHelper.getArray();
        int mid = array.length / 2;
        int[] sortedArray = sortArrayFirstInAscSecondInDesc(array, mid);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i] + "\t");
        }
    }

    private static int[] sortArrayFirstInAscSecondInDesc(int[] array, int mid) {
        for(int i = 1; i < mid; i++){
            if(array[i-1] > array[i]){
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i = 0;
            }
        }
        for(int j = mid+1; j < array.length; j++){
            if(array[j-1] < array[j]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j = mid;
            }
        }
        System.out.println();
        return array;
    }
}
