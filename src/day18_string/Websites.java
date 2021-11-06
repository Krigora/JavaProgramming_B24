package day18_string;

import java.util.Scanner;

public class Websites {

    /*
    Ask the user to type a website
    Check if the website is valid
    A website is valid if:
    begin with
    www.

    end

    at the end has:
    .com
   .edu
    .gov
    .net
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a website");
        String website = input.next();

        boolean validSrart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

        if (validSrart && validEnd) {
            System.out.println(website + " is valid");

        } else {

            if (!validSrart) {
                System.out.println("needs to begin with www.");

            } if (!validEnd) {
                System.out.println("needs to end with:  .com\n.edu\n.gov\nor .net");
            }


        }


    }

}