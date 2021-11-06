package day17_string;

import java.util.Arrays;

public class CreateStrings {

    public static void main(String[] args) {

        String first = "java"; // String literal
        // create a String object in the String pool


        String second = new String("java"); // String using new
        // creates a String object in the heap, NOT the String pool

        System.out.println(first == second); // == with string does not check the value
        // It checks the memory location and compare them

        System.out.println(first.equals(second)); // .equals compare the value, not memory location

        String third = "java";
        System.out.println(first == third);
        String fourth = third;

        System.out.println(fourth == third);

        /*
        _________________________________
                       HEAP

        _________________________________
                     STRING POOL

        first   -     "java"   -  third
                         |
                      fourth

        five     -    "Java"

      __________________________________

        second  -   [  java  ]

      __________________________________

         */
        String five = "Java";




     }

}
