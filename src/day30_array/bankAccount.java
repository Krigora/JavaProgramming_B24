package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {
        /*
        String array
        0 - first name
        1 - account number
        2 balance
        3 - account type

        do it 3 way
        create array with value
        create empty array and fill with value
        create empty array and fill with value
        through scanner

         */

        String[] bankAccountOne = {"James Bond", "303999114", "99040.43", "Checking"};
        String[] bankAccountTwo = new String[4];
        bankAccountTwo[3] = "Saving";
        bankAccountTwo[2] = "13303.32";
        bankAccountTwo[1] = "30101441";
        bankAccountTwo[0] = "Jamie";

        //  String [] arr = new String[]{"one", two};
        String[] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        bankAccountThree[0] = input.next();
        System.out.println("Enter your account number");
        bankAccountThree[1] = input.next();
        System.out.println("Enter your balance");
        bankAccountThree[2] = input.next();
        System.out.println("Enter your account type");
        bankAccountThree[3] = input.next();


// Dynamic scanner input with arrays


        String[] bankAccountFour = new String[4];
        String [] questions = {"First name", "account number", "balance", "account type"};
        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your " + questions[i]);
            bankAccountFour[1] = input.next();
        }

       // print all arrays
        System.out.println("first account: " + Arrays.toString(bankAccountOne));
        System.out.println("Second account: " + Arrays.toString(bankAccountTwo));
        System.out.println("Third account: " + Arrays.toString(bankAccountThree));
        System.out.println("Four account: " + Arrays.toString(bankAccountFour));
    }
}