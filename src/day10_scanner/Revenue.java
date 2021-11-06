package day10_scanner;

import java.util.Scanner;

public class Revenue {


    /*
    Ask the user to enter product price and quantity and then calculate the revenue.
     revenue = price Ã quantity.Â
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a product's price ");
        double price = input.nextDouble();

        System.out.println("Enter the product's quantity");
        int quantity = input.nextInt();

        double revenue = price * quantity;
        System.out.println("Revenue is " + revenue);



    }


}
