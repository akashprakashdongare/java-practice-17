package common;

public class ArrayMissingNo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 12, 13, 6, 7, 8, 9, 10};
        int length = array.length;
        int missingNo = findMissingNo(array, length);
        System.out.println("Missing no of array is : "+missingNo);
    }

    private static int findMissingNo(int[] array, int length) {
        int sum = ((length + 1) * (length + 2))/2;
        for(int i = 0; i < length; i++){
            sum = sum - array[i];
        }
        return sum;
    }
}
