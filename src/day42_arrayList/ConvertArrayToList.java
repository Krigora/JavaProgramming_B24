package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {

    public static void main(String[] args) {

        Integer [] a = {1, 2, 3};

        Arrays.asList(a); // this allows us to convert from the array to the arrayList

         // converting the 'a' array to ArrayList
        ArrayList<Integer> list = new ArrayList<>( Arrays.asList(a) );
        System.out.println(list);

        // creating an array with value right away
        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(4, 6, 1, 6, 10, 102, 50, 50, 20, 40));
        System.out.println(list2.isEmpty());
        System.out.println(list2);






    }
}
