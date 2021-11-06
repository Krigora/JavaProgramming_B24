package day41_arraysList;

import java.util.ArrayList;

public class SETMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);

        // how do you change value/element
        // arr[index] = value

        nums.set(0,1000); // remove + add together == replacing
        nums.set(3, -2000);
        System.out.println(nums.set(1, 90));

        System.out.println(nums);

        System.out.println(nums.set(1, 300));

        System.out.println(nums);
    }
}
