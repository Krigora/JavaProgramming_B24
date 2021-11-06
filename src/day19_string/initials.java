package day19_string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;
import java.util.Scanner;

public class initials {


    /*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Then print the initials
    Lames Bond = JB

    Bonus : give the initials sa uppercase
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0);

        System.out.println(initials.toUpperCase());


    }

}
