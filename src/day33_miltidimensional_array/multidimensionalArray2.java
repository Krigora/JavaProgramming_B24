package day33_miltidimensional_array;

import java.util.Arrays;

public class multidimensionalArray2 {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {100, 200, 300, 400},
                {1000, 2000}


        };

        System.out.println(arr[0].length); // this the length for the whole 2d array
        System.out.println(Arrays.toString(arr[0]));

        System.out.println(arr[2].length);
        System.out.println(Arrays.toString(arr[2]));

        System.out.println("first array: " + arr[0][0]); // read the first number from the first single array
        System.out.println("Second array: " + arr[1][0]);
        System.out.println("Third array: " + arr[2][0]);



    }

}
