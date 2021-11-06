package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListFrequency {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(5, 2, 5, 1, 4, 5, 1, 5));

        //find out how many 5 elements are in your ArrayList

        System.out.println(Collections.frequency(num, 5));
    }
}
