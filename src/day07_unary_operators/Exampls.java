package day07_unary_operators;

public class Exampls {
    /*
    Evaluate the expressions step by step. NOT in intellij, do it yourself
    int x = 2 + 3 * 2 / 1;
    what is x?
     */

    public static void main(String[] args) {

        int x = 2 + 3 * 2 / 1;
        //      2 + 6 / 1;
        //      2 + 6;
        //      8

        System.out.println(x);

       /*
       int y = ( 2 + 3 ) * 2;
       what is y?
        */
        int y = ( 2 + 3 ) * 2;
        //       (5) * 2
        //        10

        System.out.println(y);

        /*
        int w = 78 / 2 * 2 + 3 - 5 % 5;
        what is z?
         */
        int w = 78 / 2 * 2 + 3 - 5 % 5;
        //      39 * 2 + 3 - 5 % 5
        //      78 + 3 - 5 % 5 = 5 % 5 = 0
        //      78 + 2 - 0
        //      81
        System.out.println(w);

        /*
        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
         */
        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
        //      8 + 2 + 3 + 5 - 2 - 1 - 0 + 2
        //      10 + 3 + 5 - 2 - 1 - 0 + 2
        //      13 + 5 - 2 - 1 - 0 + 2
        //      18 - 2 - 1 - 0 + 2
        //      16 - 1 - 0 + 2
        //      15 - 0 + 2
        //      15 + 2
        //      17
        System.out.println(i);

        /*
        int a = 8;
        int b = a--;
        what is a?
        what is b?
         */
        int a = 8;
        int b = a--;

        // a = 7
        // b = 8

        System.out.println("a " + a);
        System.out.println("b " + b);

        /*
        int a =1
        int b = -a-- + a++ / -a-- * --a;
        what is a?
        what is b?
         */

        int l = 1;
        int k = -l-- + l++ / -l-- * --l; // a = 1 | 0 | 1 | 0 | -1
        //      -1   + 0  /   -1  * -1
        //      -1  + 0 * -1
        //      -1 + 0
        //      -1
        System.out.println("l: " + l);
        System.out.println("k: " + k);





    }
}
