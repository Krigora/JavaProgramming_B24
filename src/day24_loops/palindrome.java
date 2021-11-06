package day24_loops;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        /*
        String from user
        reverse the String
        i can use loopto get indexes backwards

        i use those reverse index with charAt
        - read chars backwards
        concat to another String

        reverse String is equal to my original String

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        String reverse = "";


        for (int index = word.length() - 1; index >= 0; index--){
            reverse += word.charAt(index);
        }
        System.out.println(reverse);

        if (word.equals(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
