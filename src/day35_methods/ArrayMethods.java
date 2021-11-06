package day35_methods;

public class ArrayMethods {
    /*
        make a method that accepts the array. Find and print the first element

        make a method that accepts the array. Find and print the last element

        make a method that accepts the array. Find and print the middle element

     */
    public static void main(String[] args) {
        int [] a = {50, 4, 100, 956,  90, 32};
        getFirstArrayElement(a);
        getLastArrayElement(a);
        getMiddleArrayElement(a);


    }

    public static void getFirstArrayElement(int [] nums){
        System.out.println("First element: " + nums[0]);
    }
    public static void getLastArrayElement(int [] nums){
        System.out.println("Last element: " + nums[nums.length - 1]);
    }
    public static void getMiddleArrayElement(int [] nums){
       if (nums.length % 2 == 1){
           // odd length

           System.out.println("Middle element: " + nums[nums.length/2]);
       }else {
          // even length
           System.out.println("First middle element: " + nums[nums.length/2 - 1] );
           System.out.println("Second middle element: " + nums[nums.length/2]);
       }


    }



}
 /*
  - creat a method that will that accepts three numbers
  */