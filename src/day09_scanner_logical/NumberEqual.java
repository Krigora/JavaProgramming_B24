package day09_scanner_logical;

import java.util.Scanner;

public class NumberEqual {

    public static void main(String[] args) {
        /*
        Ask the user enter 2 number
        and check if the number are equal
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1:");
        double numOne = scan.nextDouble();


        System.out.println("Enter number 2:");
        double numTwo = scan.nextDouble();

        System.out.println(numOne + " is equal to " + numTwo + " : " + (numOne == numTwo));


    }

}
