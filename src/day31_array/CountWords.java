package day31_array;

import java.util.Arrays;

public class CountWords {

    public static void main(String[] args) {

        String s = "java is fun";
        String [] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        System.out.println();

     //     String s2 = "Java is Fun, super fun!";
     //   System.out.println(Arrays.toString(s2.split(" ")));

        String cats = "Bengal cat tabby cat persian cat no cat here!";
        System.out.println(Arrays.toString(cats.split(" ")));

        String [] arr = cats.split(" cat ");

        System.out.println(Arrays.toString(arr));


    }
}
