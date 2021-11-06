package day13_if_statements;

import java.util.Scanner;

public class ClassesInAWeek {

    /*
    day



    monday, wednesday, thurday, saturday, sundy
    - java
    tuesday
    - soft skills
    friday
    - off
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // String day = "monday"
        String day = input.next();
        boolean isTechnicalDay = day.equals("monday") || day.equals("wednesday") || day.equals("thursday") || day.equals("saturday") || day.equals("sunday");

        boolean isSoftSkills = day.equals("tuesday");
        boolean isFriday = day.equals("Friday"); // itsTechnicalDay && !isSoftSkills

        if (isTechnicalDay){
            System.out.println("java");
        }else if (isSoftSkills){
            System.out.println("soft skills");
        } else if (isFriday){
            System.out.println("off day");
        } else {
            System.out.println("Invalid day given");
        }
    }


}
