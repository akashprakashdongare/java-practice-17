package common;

public class ArrayMinElement {
    public static void main(String[] args) {
        int[] array = 
        //{1, 2 , 3, 4, 11, 100, 5, 6, 7, 8, 9, 10};
        {1, 2 , 3, 111, 4, 11, 100, 5, 6, 7, 8,91, 9, 10, 99};
        //{1, 2 , 0, 3, 111, 4, 11, 100, 5, 6, 7, 8,91, 9, 10, 99};
        //findMin(array);
        //findFirstAndSecondMin(array);
        findFirstSeconThirdMin(array);
    }
    
    private static void findFirstSeconThirdMin(int[] array) {
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE, thirdMin = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < firstMin){
                thirdMin = secondMin;
                secondMin = firstMin;
                firstMin = array[i];
            } else if(array[i] < secondMin){
                thirdMin = secondMin;
                secondMin = array[i];
            } else if(array[i] < thirdMin){
                thirdMin = array[i];
            }
        }
        System.out.println("First min : "+firstMin);
        System.out.println("Second min : "+secondMin);
        System.out.println("Third min : "+thirdMin);
    }

    private static void findFirstAndSecondMin(int[] array) {
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < firstMin){
                secondMin = firstMin;
                firstMin = array[i];
            } else if(array[i] < secondMin){
                secondMin = array[i];
            }
        }
        System.out.println("First min : "+firstMin);
        System.out.println("Second min : "+secondMin);

    }

    private static void findMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min)
            min = array[i];
        }
        System.out.println("Min : "+min);
    }
}
