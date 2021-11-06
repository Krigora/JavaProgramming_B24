package day30_array;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++){
            int eachNumber = nums[i];
            System.out.println("number " + nums[i]);
        }
        System.out.println();

        for (int eachNumber : nums){
            System.out.println("number " + eachNumber); // eachNumber = nums[1}
        }

        String [] strs = {"java ", "selenium ", "db ", "api"};
        for (int i = 0; i < strs.length; i++){
            System.out.print(strs[i]);
        }
        System.out.println();

        for (String word : strs){
            System.out.print(word);
        }
    }
}
