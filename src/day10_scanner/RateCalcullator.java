package day10_scanner;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class RateCalcullator {

    /*
    Ask the user to enter a salary (double)
    Print the hourly rate (double) of the employee
    assume that one year has 52 weeks
    hourRate = salary / (weeklyHour * 52)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is you salary");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work a week ");
        int weeklyHours = input.nextInt();

        double hourlyRate = salary / (weeklyHours * 52);

        System.out.println( " With a salary of " + salary + " your hourly rate for " + weeklyHours + " hours a week is " + hourlyRate);















    }

}
