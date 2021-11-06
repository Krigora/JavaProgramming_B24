package day28_nester_loops;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class primeInRange {
    /*
    Prime in rangeGiven a number. Print out all the prime numbers from 2 to that numberA prime number is a number that is only divisible by 1 and itself.Ex:
    Input:50
    Output:
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
     */
    public static void main(String[] args) {

    //    int number = 17;
    //    boolean isPrime = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int range = input.nextInt();

        for (int number = 2; number <= range; number++){

            boolean isPrime = true;

            for (int j = 2; j < number; j++){
                if (number % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(number + "");
            }
        }

    }
}
