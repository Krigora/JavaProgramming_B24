package day22_loops;

public class Factorial {

    /*
     write a program that can return the factorial number of any given number Ex:input: !5 output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
     */

    public static void main(String[] args) {
        int number = 6;
        int total = 2;

        while (number > 1){
            System.out.println(total + " * " + number + " " );
            total *= number; // total = total * number
            number--;
        }
        System.out.println(total);
/*
starting
number : 5
total: 1

iteration: 1
number: 4
total : 1 * 5 = 5

iteration: 2
number: 3
total : 5 * 4 = 20

iteration: 3
number: 3
total : 20 * 3 = 60

iteration: 4
number: 2
total : 60 * 2 = 120

 */



    }
}
