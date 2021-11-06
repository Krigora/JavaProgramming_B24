package day13_if_statements;

import java.util.Scanner;

public class yasOrNow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("whay is your first name");
        String firstName = input.next();

        System.out.println(firstName + " Do you like soccer");
        String likeSoccer = input.next();

        if (likeSoccer.equals("yes") || likeSoccer.equals("yes") || likeSoccer.equals( "Yes")){

            System.out.println("Who is your favorit team");
            String team = input.next();
            System.out.println("Oh i like " + team + " too");
        } else if (likeSoccer.equals("no")){
            System.out.println("Thank okay");

        } else {
            System.out.println(firstName + "You didnt answer the question");
        }




    }
}
