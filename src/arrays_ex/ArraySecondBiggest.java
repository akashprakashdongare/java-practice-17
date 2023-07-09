package arrays_ex;

import java.util.Arrays;
import java.util.Comparator;

import helper.ArrayHelper;

public class ArraySecondBiggest {
    public static void main(String[] args) {
        Integer[] array = ArrayHelper.getIntegerObjectArray();

        int secondByStream = Arrays.asList(array).stream()
                          .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second by stream : " + secondByStream);

        int first = 0;
        int second = 0;
        int third = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > first){
                third = second;
                second = first;
                first = array[i];
            } else if(array[i] > second){
                third = second;
                second = array[i];
            } else if(array[i] > third){
                third = array[i];
            }
        }

        System.out.println("first : " + first);
        System.out.println("second : " + second);
        System.out.println("third : " + third);
    }
}
