package day22_loops;

import java.util.Scanner;

public class HelloProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        ask for message

        hello = hi

        bye = okay bye and stops the conversion
         */
        boolean continueTalkink = true;
        while (continueTalkink) {

            System.out.println("Enter your message");
            String msg = input.nextLine();
            if (msg.equals("Hello")) {
                System.out.println(("hi"));

            } else if (msg.equals("bye")) {
                System.out.println("okay bye");
                continueTalkink = false;
            }

        }
    }
}
