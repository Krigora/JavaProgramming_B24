package day31_array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertName {

    public static void main(String[] args) {

        /*
        Ask the user to enter their first name
        Display each character as an array
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first name");
        String name = input.next();

        // you could also store to variable
        char [] firstName = name.toCharArray();

        System.out.println((Arrays.toString(name.toCharArray())));

     //   System.out.println(name.toCharArray()[0]); also valid for first letter
        System.out.println(firstName[0]);
        System.out.println(firstName[firstName.length - 1]);
        System.out.println(firstName[0] + " " + firstName[1]);

    }
}
