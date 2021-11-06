package day13_if_statements;

import java.util.Scanner;

public class OxygenLevel {

    public static void main(String[] args) {

        /*
        [Oxygen level - If statements, operators]
        You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
        > Above 90 - Your tank is full> Above 80 - Still okay
        > Above 70 - Don't go too far
        > Above 60 - Start to head back
        > Above 50 - Be careful now you at 50%
         */

        Scanner input = new Scanner(System.in);
        // int oxygenLevel = 80
        int oxygenLevel = input.nextInt();
        String message = "";


    if (oxygenLevel >= 90){
        message = "Your tank is full";
    } else if (oxygenLevel >=80){
        message = "Still okey";
    } else if ( oxygenLevel >= 70) {
        message = "Don't go too far";
    } else if (oxygenLevel >= 60){
        message = message = "Star to head back";
    }  if (oxygenLevel >= 50) {
            message = "Be careful now you are at 50%";
        } else
            message = "Sellow 50%";
            System.out.println(message);
;





    }
}
