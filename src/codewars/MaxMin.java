package codewars;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
         int[] arr = {2334454,3,5};
         int max = arr[0];
         int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if( arr[i] < min){
               min = arr[i];
            }
        }
        System.out.println(Arrays.toString(new int[]{min, max}));
    }
}
