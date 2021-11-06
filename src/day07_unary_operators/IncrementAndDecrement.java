package day07_unary_operators;

import java.sql.SQLOutput;

public class IncrementAndDecrement {

    public static void main(String[] args ) {

        int n = 0;
        n++;
        System.out.println(n);  //1
        System.out.println(++n); //2

        System.out.println(n++); // prints 2, but n still increment after
        System.out.println(n); // print 3

        int age = 10;
        System.out.println(age);
        System.out.println(age++);
        System.out.println(age);
        System.out.println(++age);
        System.out.println(age); // 12


        System.out.println(age++ * 2);
        System.out.println(age); // age 13


        System.out.println(++age + 2); // 14 + 2
        System.out.println(age); //14




    }
}
