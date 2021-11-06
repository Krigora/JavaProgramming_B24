package day15_switch;

import java.util.Scanner;

public class hotel {

    public static void main(String[] args) {

        /*


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java Hotel");
        System.out.println("How many peple in your party");
        int numberOfPeopole = input.nextInt();
        System.out.println("How many days will you stay");
        int numberOfDays = input.nextInt();
        boolean validPartySize = true;
        String roomType = "";
        double price = 0;
        String peopleMsg = "people";

        switch (numberOfPeopole) {
            case 1:
                roomType = "single room";
                price = numberOfDays * 100;
                peopleMsg = "person";
                break;

            case 2:
                roomType = "Double room";
                price = numberOfDays * 125;
                break;
            case 3:
            case 4:
                roomType = "Large room";
                price = numberOfDays * numberOfPeopole * 150;
                break;
            // when the value is 3 or 4 it runs the same code above
            case 5:
            case 6:
                roomType = "suite";
                price = 5000;
                break;
            // when the value is 5 or 6 it runs the same code above

            default:
                System.out.println("Party size is too big");
                validPartySize = false;

        }
        if (validPartySize) {
            System.out.println("Okey great, for " + numberOfPeopole + " people staing far " + numberOfDays + " day " + " your total price is: $ " + price + " for a " + roomType);
        }
    }

}
