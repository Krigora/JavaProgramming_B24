package day09_scanner_logical;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        /*
        180 - triangle
        360 - circle

        3 angles
         */

        Scanner input = new Scanner(System.in);
        int angleCounter = 1;

        System.out.println( "Enter  angle " + angleCounter++);

        double angleOne = input.nextDouble();

        System.out.println(" Enter  angle " + angleCounter++);
        double angleTwo = input.nextDouble();

        System.out.println(" Enter  angle " + angleCounter++);
        double angleTree = input.nextDouble();

        double sum = angleOne + angleTwo + angleTree;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

        System.out.println("Is a triangle" + isTriangle);
        System.out.println(" Is a circle " + isCircle);






    }
}
