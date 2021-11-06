package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    /*
    Arraylist of caffeinated drinks.

    Figure out how mach caffeine each drink has, and store that into a new ArrayList

    coffee - 80
    tea - 50
    monster - 100
    red bull - 100
    coke - 70
    pepsi - 70
    bang - 100
    apple juice - 0
     */
    public static void main(String[] args) {

        String[] alldrinks = {"coffee", "tea", "monster", "red bull", "coke", "pepsi", "bang", "apple juice"};

        ArrayList<String> drinkList = new ArrayList<>(Arrays.asList(alldrinks));


        ArrayList<Integer> caffeineAmounts = new ArrayList<>(Arrays.asList());

        for (String eachDrink : drinkList) {

            int caffeineNum = 0;

            switch (eachDrink) {
                case "apple juice":
                    caffeineNum = 0;
                    break;
                case "tea":
                    caffeineNum = 50;
                    break;
                case "coke":
                case "pepsi":
                    caffeineNum = 70;
                    break;
                case "caffee":
                    caffeineNum = 80;
                    break;
                case "red bull":
                case "monster":
                case "bang":
                    caffeineNum = 100;
                    break;

            }
            caffeineAmounts.add(caffeineNum);

        }

      //  System.out.println(drinkList);
     //   System.out.println(caffeineAmounts);;
        System.out.println("=========== Cafeine Table -----------");
        for (int i = 0; i < drinkList.size(); i++){
            System.out.println("Drink: " + drinkList.get(i));
            System.out.println("caffeine amount: " + caffeineAmounts.get(i));
            System.out.println();
        }
        System.out.println("-------- FINISH ---------");
    }

}
