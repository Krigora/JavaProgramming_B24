package day09_scanner_logical;

import java.util.Scanner;

import day5_Variables.MyName;

public class ScannerDate {

    public static void main(String[] args) {
        /*
        Ask the user enter the month number
         Ask the user enter the day number
          Ask the user enter the year number
          8/7/2021
         */

Scanner input = new Scanner(System.in);
        System.out.println("Enter the mount number");
      //  int month = 8; - old ? hardcoded way
        int month = input.nextInt();
        System.out.println("Enter the day number");
        int day = input.nextInt();
        System.out.println("Enter the year number");
        int year = input.nextInt();

        System.out.println(month + "/" + day + "/" + year);





    }
}
