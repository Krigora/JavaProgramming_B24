package day18_string;

public class RecapMethods {

    public static void main(String[] args) {

        String day = "thursDAY";
        boolean b = day.equals("Thursday");
        System.out.println(b);
        System.out.println(day.equalsIgnoreCase("Thursday"));

        day = day.toUpperCase();
        System.out.println(day);

        System.out.println(day.toLowerCase());
        System.out.println(day);

        System.out.println(day.length() + 1);
        System.out.println(day);

        day = day.length() + ""; // types: int + String = concatenation = String type back
        System.out.println(day + 2); // string + int = concatenation = "8" + 2 = "82"

        System.out.println("5 + 2 = " + 5 + 2);
        System.out.println("5 + 2 = " + (5 + 2));


    }
}
