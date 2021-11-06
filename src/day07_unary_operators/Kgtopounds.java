package day07_unary_operators;

public class Kgtopounds {
    /*
    create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
    Ex:kg = 10;
    output:10 kg equal to 22.0462 poundskg = 20
    output:
    20 kg equal to 44.0924 pounds....
    Hint: 1kg = 2.20462 pounds
     */

    public static void main(String[] args) {

        int kg = 10;
        double oneKg = 2.20162;
        double pound = kg * oneKg;


        System.out.println(kg);
        System.out.println(pound);

        System.out.println(kg + " kg equal to " + pound + " pound");


    }
}
