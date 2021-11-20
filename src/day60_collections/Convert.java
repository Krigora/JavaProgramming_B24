package day60_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Convert {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 3, 1 , 4 , 3 , 1 , 4 , 5 , 6 , 2 , 1, 3 ));

        // remove all duplicate value

        Set<Integer> unique = new HashSet(nums);
        System.out.println(unique);

        Set<String> obj = new HashSet<>();
        obj.add(null);
        obj.add("hello");
        obj.add("$4.0");
        obj.add("100");
        obj.add("hello");
        obj.add("%");
        System.out.println("original: " + obj);
        System.out.println("New: " + new ArrayList<>(obj));
    }
}
