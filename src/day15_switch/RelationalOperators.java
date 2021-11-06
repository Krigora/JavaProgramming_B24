package day15_switch;

import java.util.Scanner;

public class RelationalOperators {

    /*
    Browsers
    chrome
    firefox
    safari
    ie
    edge
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which browser do you want to use");
        String browser = input.next();
        System.out.println("Enter the url:");
        String url = input.next();

        switch (browser) {
            case "Chrome":
                System.out.println("Opening " + url + " in chrome");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in firefox");
                break;
            case "Safari":
                System.out.println("Your mac opening safari");
                System.out.println("Going to " + url);
                break;
            case "ie":
                System.out.println("IE is not longer supported");
                break;
            case "edge":
                System.out.println("Edge is oppening " + url);
                break;
            default:
                System.out.println("Invalid browser");


        }


    }
}
