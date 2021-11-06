package day11_if_Statements;

import java.util.Scanner;

public class myPracticeThree {

/*
Write a Java program to implement following logic using if statement.
 if hour is less than 12 noon, greet with Good Morning.
 if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon.
 if hour is greater than or equal to 3 pm, greet with Good Even
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What time is it?");
        double nowTime = input.nextDouble();

        System.out.println("\t1) If hour is less than 12 noon");
        System.out.println("\t2) if hour is greater than or equal 12 noon but less than 3 pm" );
        System.out.println("\t3) if hour is greater than or equal to 3 pm");

        int selection = input.nextInt();

        if(selection == 1) {
            System.out.println("Greet with Good Morning");
        }
        if (selection == 2 ) {
            System.out.println("Greet with Good Afternoon. ");
        }
        if (selection == 3 ) {
            System.out.println("greet with Good Even.");
        }

    }


}
