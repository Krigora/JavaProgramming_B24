package day22_loops;

import java.util.Scanner;

public class AddNumbers {

    /*
    Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
hint: you need an infinite loop

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        boolean positiveNumber = true;

        while (positiveNumber){
            System.out.println("Enter a number");
            int number = input.nextInt();



          if (number < 0){
              positiveNumber = false;
          } else {
              sum += number; // sum = sum + number
          }
        }
        System.out.println("sum: " + sum);

    }


}
