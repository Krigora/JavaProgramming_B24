package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethod {

    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(5);

        nums.addAll(Arrays.asList(3, 5, 1, 2, 5));

        ArrayList<Integer> other = new ArrayList<>( Arrays.asList( 10, 20));

        // nums.add(other.get(0)) ;
        // nums.add(other.get(1)) ;


        nums.addAll(0, other); // puts all the value of the other ArrayList starting from index 0


        System.out.println(nums);
        System.out.println(other);

        nums.removeAll( Arrays.asList(5, 10, 3));

        System.out.println(nums);

        System.out.println(nums.removeAll(Arrays.asList(30)));

    }
}
