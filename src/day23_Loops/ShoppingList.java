package day23_Loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        /*
        continue to store items to a shopping list
         */

        Scanner input = new Scanner(System.in);

        String shoppingList = "";
        String addMore;

        do {


            System.out.println("Enter your item");
            shoppingList += input.nextLine() + ", ";


            System.out.println("Do you want to add more& y or n");
            addMore = input.nextLine();

        } while (addMore.equals("y"));

        System.out.println(shoppingList.substring(0, shoppingList.length()-2)); // -2 because , and space


    }



}
