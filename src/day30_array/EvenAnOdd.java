package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAnOdd {
    /*
    declare an int array
    count haw many even number there is
    count haw many odd number there is

    print your counters

    challenges^
    traditional for loop
    for each loop

    - not hard code in initial array, but use scanner to get the number

     */

    public static void main(String[] args) {
    // int[] numbers = {9, 24, 5, 1, 5, 29, 52};
        Scanner input = new Scanner(System.in);
        System.out.println("How many number do you want to enter ");
        int size = input.nextInt();



        int [] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Enter your number");
            numbers[i] = input.nextInt();
        }

        int even = 0;
        int odd = 0;

        String evenNumbers = "";
        String oddNumbers = "";

        for (int eachNum : numbers) {
            if (eachNum % 2 == 0) {
                even++;
                evenNumbers += eachNum + " ";
            } else {
                odd++;
                oddNumbers += eachNum + " ";
            }
        }


        //    for (int i = 0; i < numbers.length; i++ ){
        //      if (numbers[i] % 2 == 0){
        //          even++;
        //          evenNumbers += numbers[i] + " ";

        //      }else {
        //          odd++;
        //          oddNumbers += numbers[i] + " ";
        //     }
        //   }


        System.out.println(Arrays.toString(numbers));
        System.out.println("Even: " + even);
        System.out.println("Evan numbers: " + evenNumbers);
        System.out.println("odd: " + odd);
        System.out.println("odd number: " + oddNumbers);

    }
}
