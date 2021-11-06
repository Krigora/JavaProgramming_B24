package day05_Variables;

public class CastingExamples {

    public static void main(String[] args) {

        long number = 98;
        long number2 = 100L;

        short number3 = 10;
        float number4 = number3;

        System.out.println(number4);


        long number5 = 11;
        int number6 = (int)number5;

        System.out.println(number6);

        double number7 = 40.5;
        int number8 = (int)number7;

        System.out.println(number8);

        int number10 = 200;
        byte number11 = (byte)number10;

        System.out.println(number11);

        System.out.println((char) 97);
        char letter = 'G';
        System.out.println((int)letter);












    }
}
