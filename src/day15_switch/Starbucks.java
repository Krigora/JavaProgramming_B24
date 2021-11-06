package day15_switch;

import java.util.Scanner;

public class Starbucks {

    public static void main(String[] args) {

        /*
        coffee
        tall, grande, venti
        price
        calories
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Starbucks");
        System.out.println("Which siza would you like");
        String size = input.next();

        double price = 0;
        int calories = 0;

        switch (size) {
            case "tall":
                price = 3.50;
                calories = 100;
                break;

            case "grande":
                price = 4.50;
                calories = 150;
                break;
            case "venti":
                price = 6.50;
                calories = 200;
break;
            default:
                System.out.println("We dont serve that size");
        }

        System.out.println("You order was a " + size);
        System.out.println("Total price is $ " + price);
        System.out.println("Total calories " + calories);


        }

    }

