package day32_array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        // String input: 3 word
        // reverse the middle word

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = input.nextLine();
        input.close(); // close your Scanner

String [] words = str.split(" ");
String reverse = "";

for (int i = words[1].length()-1; i >= 0; i--){
    reverse += words[1].charAt(i);

}
        System.out.println(words[0] + " " + reverse + " " + words[2]);
    }
}
