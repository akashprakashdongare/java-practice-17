package common;

public class ArrayMaxElement {
    public static void main(String[] args) {
        int[] array = 
        //{1, 2 , 3, 4, 11, 100, 5, 6, 7, 8, 9, 10};
        {1, 2 , 3, 111, 4, 11, 100, 5, 6, 7, 8,91, 9, 10, 99};
       // findMax(array);
        //findFirstAndSecondMax(array);
        findFirstSecondThird(array);
    }

    private static void findFirstSecondThird(int[] array) {
        int firstMax = 0, secondMax = 0, thirdMax = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = array[i];
            } else if(array[i] > secondMax && array[i] < firstMax){
                thirdMax = secondMax;
                secondMax = array[i];
            } else if(array[i] > thirdMax){
                thirdMax = array[i];
            }
        }
        System.out.println("First max : "+firstMax);
        System.out.println("Second max : "+secondMax);
        System.out.println("Third max : "+thirdMax);
    }

    private static void findFirstAndSecondMax(int[] array) {
        int firstMax = 0, secondMax = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > firstMax){
                secondMax = firstMax;
                firstMax = array[i];
            } else if(array[i] > secondMax && array[i] < firstMax){
                secondMax = array[i];
            }
        }
        System.out.println("First max : "+firstMax);
        System.out.println("Second max : "+secondMax);
    }

    private static void findMax(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Max : "+max);
    }
}
