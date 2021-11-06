package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayMy {
    /*
    Given an int array reverse the elements’ order
    Ex:
    Input: { 1, 2, 3, 4 }
    Output: { 4, 3, 2, 1 }
    Challenge:Reverse the elements without making a new array
     */
    public static void main(String[] args) {
        int [] str = {1, 2, 3, 4};

        //  Scanner input = new Scanner(System.in);
        //  System.out.println("How many number do you want to enter ");
        //  int size = input.nextInt();
        //  int [] numbers = new int[size];

        for (int i = str.length - 1; i >= 0; i--) {

            //  System.out.println("Enter your number");
            //   numbers[i] = input.nextInt();
            String reverse = "";
            reverse += str[i];


            System.out.print(reverse);

        }


    }


}
