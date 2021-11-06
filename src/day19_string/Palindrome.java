package day19_string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Palindrome {

    public static void main(String[] args) {



    /*
    in this approach we will reverse the String manually
    Then check if the String is the same as the original
     */

    String word = "abc";
    String reverse  = "" + word.charAt(2) + word.charAt(0) + word.charAt(1);

        System.out.println(reverse);

        if (word.equals(reverse)) {
            System.out.println("palindrome");

        }else {
            System.out.println("not palindrome");
        }



}




}



