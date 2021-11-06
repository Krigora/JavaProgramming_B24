package day33_miltidimensional_array;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {

        int [] a = { 1, 2, 3};
        int [] b = a;

        a[0] = 100;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        System.out.println();

        int [] c = {20, 300, 40};
        c[0] = 45;
        int [] d = Arrays.copyOf(c, c.length+1);

        c[0] = 200;
        c[1] = 200;
        d[3] = 1000;

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

    }
}
