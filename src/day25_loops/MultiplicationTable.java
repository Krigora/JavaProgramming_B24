package day25_loops;

public class MultiplicationTable {
    /*
    number * 1
    number * 2
    number * 3

     */

    public static void main(String[] args) {
        int number = 4;


         for (int i = 1; i <= 10; ++i){
             System.out.println(number + " x " + i + " - " + (number * i));

         }
    }

}
