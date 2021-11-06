package day20_string;

import java.util.Scanner;

public class HaveAJava {

    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.indexOf("java") == 0){
            System.out.println(!exists);

        } else if (word.indexOf("java") == 1){
            System.out.println(!exists);
        }else {
            System.out.println(exists);
        }



    }

}
