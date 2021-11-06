package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        /*
        pick 3 colors for the image
        colors need to be unique
         */

        Scanner input = new Scanner(System.in);

        String pickedColors = "";
        int colorsPicKet = 0;

        while (colorsPicKet < 3) {
            System.out.println("Enter a color: ");
            String color = input.nextLine();

            if (pickedColors.contains(color)) {
                System.out.println("Pick a different color");
            } else {
                pickedColors += color + " ";
                colorsPicKet++;

            }
        }
        System.out.println("You picket " + pickedColors.trim().substring(0, pickedColors.length()-1));


    }
}
