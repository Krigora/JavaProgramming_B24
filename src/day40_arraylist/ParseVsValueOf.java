package day40_arraylist;

import java.sql.SQLOutput;

public class ParseVsValueOf {

    public static void main(String[] args) {
        String s = "30";
        System.out.println(s + 5);
      int second = Integer.parseInt(s);
        System.out.println(second);

        System.out.println(second < 60);

       Integer num = Integer.valueOf(s); // convert the "30" String into the Integer wrapper class object that has a value of

        System.out.println(num < 60);

        String s2 = String.valueOf(second); // convert the int seconds of 30 to the String object
        System.out.println(s2);
        System.out.println(s2.charAt(0));

        }

    }


