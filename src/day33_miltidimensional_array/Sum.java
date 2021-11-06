package day33_miltidimensional_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        /*
        given an array, I want to calculate the sum and put the sum value to a new element at end
         */

        int []  arr = {1, 5, 2, 5};

        // 1 5 2 5

        int [] newArr = Arrays.copyOf(arr, arr.length+1);

        int sum = 0;

        for (int num : arr){
            sum += num;
        }

        newArr[newArr.length - 1] = sum;
        System.out.println(Arrays.toString(newArr));

    }
}
