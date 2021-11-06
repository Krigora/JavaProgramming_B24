package day39_wrapper_arraylist;

import java.util.Scanner;

public class ParseExamples {

    public static void main(String[] args) {

        //converting the String characters to a number

        String year = "2009";
        System.out.println(year +1);

        int intYear = Integer.parseInt(year);
        System.out.println(year);
        System.out.println(intYear);

        System.out.println(year + 1);
        System.out.println(intYear + 1);

        /*
        Ask the user to enter some text
        i am x year olds
        In 5 years you will be: $age
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = input.nextLine();


        String [] arr = text.split(" ");
        String ageText = arr[2];

        /*
        text.split(" ") -> [ "I", "am", "10", "years", "old"]
        rr[2] -> second element of the array

         */

        int age = Integer.parseInt(ageText);
        System.out.println("In 5 years you will be " + (age + 5));

        String priceStr = "112.99";
        double priceDouble = Double.parseDouble(priceStr);
        System.out.println(priceDouble);


    }
}
