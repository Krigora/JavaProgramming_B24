package day24_loops;

import java.util.Locale;
import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {

        /*
        ask for a word
        ask for a letter
        is the letter unique in the word

        java
        j
        -> unique

        java
        a
        -> not unique
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next().toLowerCase();
        System.out.println("Enter a letter");
        char letter = input.next().toLowerCase().charAt(0);
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;

            }

        }
        if (count == 1) {
            System.out.println(letter + " is unique ");
        } else if (count == 0){
            System.out.println(letter + " was not in the string");
        } else {
            System.out.println(letter + " is not unique");
        }
    }

}
