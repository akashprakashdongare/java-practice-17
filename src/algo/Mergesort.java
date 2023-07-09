package algo;

public class Mergesort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10, 20, 50, 90, 100};
        int index = findIndexOfValue(array, array.length, 0 ,2);
        System.out.print(index + 1);
    }

    private static int findIndexOfValue(int[] array, int max, int min, int no) {
        int mid = min + (max - min)/2;

        if(array[mid] == no)
            return mid;
        else if(array[mid] < no)
                 return findIndexOfValue(array, max, mid+1, no);
             else if(array[mid] > no)
                      return findIndexOfValue(array, mid-1, min, no);
        return 0;
    }
}
