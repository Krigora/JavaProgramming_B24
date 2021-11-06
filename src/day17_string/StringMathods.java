package day17_string;

import java.util.Locale;

public class StringMathods {

    public static void main(String[] args) {

        String name = "james";
        System.out.println(name.equals("james"));  // true

        System.out.println(name.equals("James")); // false

        System.out.println(name.equalsIgnoreCase("JAMes" )); // true

        System.out.println(name.equalsIgnoreCase("JaMeS")); // true


        System.out.println(name.toUpperCase()); //  JAMES
        System.out.println(name);

        String lastName = "bond";
        lastName = lastName.toUpperCase();
        System.out.println(lastName);

        System.out.println(lastName.toLowerCase()); // bond

        System.out.println(lastName); // BOND

        String word =  "Monday";
        int length = word.length();
        System.out.println(length); // 6
        System.out.println(word.toLowerCase());

    }

}
