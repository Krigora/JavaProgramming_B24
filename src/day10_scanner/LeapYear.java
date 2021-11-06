package day10_scanner;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        /*
        Ask the user to enter a year.
        Determine if the year is a leap year or not.
        You can assume a leap year is a year that is divisible by 4.
         Print true or false.
         Hint: use remainder operato
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
       boolean leapYearOrNot = year % 4 == 0 ;
        boolean leapYear  = true;

        System.out.println(" A year " + year + " is a leap year: " +  leapYearOrNot);






    }
}
