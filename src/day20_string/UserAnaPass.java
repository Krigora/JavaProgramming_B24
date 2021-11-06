package day20_string;

import sun.security.util.Password;

public class UserAnaPass {
    /*
    [Username and Password]
Given a username and password verify they are valid. - The password cannot be less than 5 characters
If it is less print: "Password cannot be less than 5 characters" If it is more than or equal to 5 print: "Valid password"
- Also, the password should not contain the username - If the password has the username in it print:
"Invalid password, username should not be in it"
Also change the password to have the value: "password"
     */

    public static void main(String[] args) {
        String userName = "jamesbond4";
        String password = "abcjamesbond";

        if (password.length() >= 5 && !password.contains(userName)) {
            System.out.println("valid password");
        } else {
            System.out.println("Invalid password");

            if (password.length() < 5) {
                System.out.println("Password cannot be less than 5 characters");
            }
            if (password.contains(userName)) {
                System.out.println("Password cannot contain the username");
            }
        }
    }
}


