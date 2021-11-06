package day23_Loops;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class GuessNumber {
    /*
    there is a number perdefined
    1-100

    we want the user to guess
80

= 50
50 is too small
= 90
90 is too big

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 80;
        int userGuess;
        int attempts = 0;

        do {

            System.out.println("Guess a number");
            userGuess = input.nextInt();
            attempts++;

            if (userGuess > 0 && secretNumber <= 100) {
                System.out.println("Good guess! The number was: " + secretNumber);
            } else if (userGuess < secretNumber) {
                System.out.println(userGuess + " is too small");
            } else if (userGuess > secretNumber) {
                System.out.println(userGuess + " is too big");
            } else {
            System.out.println("Invalid number, needs to be between 1-100");
        }

        }while (userGuess != secretNumber);

    if (attempts <=2 ) {
        System.out.println("really good guess");
    } else if (attempts <=4 ) {
        System.out.println("still good guess");
    } else {
        System.out.println("a lot of guesses but you got it");


    }
}

}
