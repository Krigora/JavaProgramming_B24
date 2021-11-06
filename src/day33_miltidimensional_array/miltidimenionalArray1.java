package day33_miltidimensional_array;

import java.util.Arrays;

public class miltidimenionalArray1 {
    public static void main(String[] args) {

        int [] a = {1, 2, 3}; // single dimensional
        int [] b = {4, 5, 6}; // single dimensional

        int [][] all = { a, b}; // 2d array

        System.out.println(Arrays.toString(all[0])); // print the first element of the 2d array which is the a array
        System.out.println(Arrays.toString(all[1])); // print the first element of the 2d array which is the a array
        System.out.println(all.length);

        System.out.println(Arrays.deepToString(all)); // print the whole 2d array
    }
}
