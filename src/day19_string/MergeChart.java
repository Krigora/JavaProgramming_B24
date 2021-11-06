package day19_string;

import java.util.Scanner;

public class MergeChart {
    /*
    String ane : abc
    String two: def

    merge to get : adbecf
     */

    public static void main(String[] args) {

String one = "abc";
String two = "def";

String merget = "";

merget += one.charAt(0);
merget += two.charAt(0);

merget += one.charAt(1);
merget += two.charAt(1);

merget += one.charAt(2);
merget += two.charAt(2);

        System.out.println(merget);







    }
}
