package day59_exeptions;

import java.util.Enumeration;

public class Recap {

    public static void main(String[] args) {
        int [] nums = {3, 5, 1, 5};
        try {
            System.out.println(nums[2]); // valid case
            System.out.println(nums[10]); // invalid case
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("hat was invalid index");
            System.out.println(nums[0]);
        } finally {
            System.out.println("DONE");
        }


    }
}
