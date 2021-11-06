package day11_if_Statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int temp 90;
        System.out.println("Enter the temperature");
        int temp = input.nextInt();



        if (temp >= 70) {
            System.out.println("Its a nice day");
            System.out.println("maybe go for a picnic");

        } else {
            System.out.println("it is cold");
            System.out.println("stay home and write java code");
        }

    }
}
