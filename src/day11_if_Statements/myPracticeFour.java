package day11_if_Statements;

import java.util.Scanner;

public class myPracticeFour {
    /*
    [Oxygen level - If statements, operators]
    You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
    > Above 90 - Your tank is full
    > Above 80 - Still okay
    > Above 70 - Don't go too far
    > Above 60 - Start to head back
    > Above 50 - Be careful now you at 50%
     */

    public static void main(String[] args) {

        int level = 60;

        if (level >= 90) {
            System.out.println("Your tank is full");
        }

        if (level >= 80 & level < 90) {
            System.out.println("Still okay");
        }
        if (level >= 70 & level < 80) {
            System.out.println("Don't go too far");
        }
        if (level >= 60 & level < 70) {
            System.out.println("Start to head back");
        }
        if (level >= 50 & level < 60) {
            System.out.println("Be careful now you at 50%");
        } else {
            if (level < 50) {
                System.out.println("Quickly to the outside");
            }
        }


        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();


        if (a > b) {

            System.out.println(a + "is a greater");
        } else {
            System.out.println(b + "is a greater");


        }
    }

}

