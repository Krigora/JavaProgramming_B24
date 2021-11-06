package day34_methods;

import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        gatAge(2000);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth year");
        int year = input.nextInt();
        gatAge(year);

    }

    public static void gatAge(int year){
        System.out.println("You age in 2021 is");
        System.out.println(2021 - year);
    }
}
