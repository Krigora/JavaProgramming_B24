package day16_switch;

import day15_switch.BreakStatement;

import java.util.Scanner;

public class DaysInWeek {

/*
add new class DaysInWeek (redo)
add a main method

Write a program that will display the given day based on a number input.
Start with 1 for Monday up to 7 for Sunday. Handle the invalid day numbers

    Ex:
        input: 2
        output: Tuesday

        String result = "";

        if(day == 1){
            result = "Monday";
        } else if(day == 2) {
            result = "Tuesday";
        } else if(day == 3){
            result = "Wednesday";
        } else if(day == 4){
            result = "Thursday";
        } else if(day == 5){
            result = "Friday";
        } else if(day == 6){
            result = "Saturday";
        } else if(day == 7){
            result = "Sunday";
        } else {
            result = "Invalid day number";
        }

        System.out.println(result);
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number from 1-7");
        int day = input.nextInt();

        String dayInWord = "";

        switch (day){
            case 1: dayInWord = "Monday"; break;
            case 2: dayInWord = "Tuesday"; break;
            case 3: dayInWord = "Wednesday"; break;
            case 4: dayInWord = "Thursday"; break;
            case 5: dayInWord = "Friday"; break;
            case 6: dayInWord = "Saturday"; break;
            case 7: dayInWord = "Sunday"; break;
            default: dayInWord = "Invalid day number. Needs to be between 1-3";

        }
        System.out.println(day);
        System.out.println(dayInWord);
    }

}
