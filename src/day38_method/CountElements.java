package day38_method;

import java.util.Arrays;

public class CountElements {
    /*
    Create a method that accept an int array a number
    count and return the number of times the given number is found in the array

    return type: int
    method name: frequencyOfElement
    parameters: int [], int

    Ex: Input:
    {1, 2, 5, 1, 4, 1}, 1

    output:

    3
     */
    public static void main(String[] args) {
        int [] a = {1, 2, 5, 1, 5, 1, 3};

        System.out.println(frequencyOfElement(a, 1));
        System.out.println(frequencyOfElement(a, 2));
        System.out.println(frequencyOfElement(a, 5));

        getUniqueElements(a);

    }


    public static int frequencyOfElement(int[]num,int element){
        int count = 0;
        for(int each : num){
            if(each == element){
                count++;
            }


        }
        return count;
    }
    /*
    Given a int array, find and print all of the unique elements
     */

    public static void getUniqueElements (int [] nums){

        for (int each : nums){
            int counter = frequencyOfElement(nums, each);
            if (counter == 1){
                System.out.println(each);
            }
        }
    }
}
