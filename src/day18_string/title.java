package day18_string;

public class title {

    /*
    Mr
    Mrs
    Dr
    Senior
    Madam
    Senior - Sr.
    Junior - Jr.
     */
    public static void main(String[] args) {
        String name = "Mr James Jr";

        if (name.startsWith("Mr")) {
            System.out.println("Hello Mr");

        } else if (name.startsWith("Mrs")) {
            System.out.println("Hello Mrs");
        } else if (name.startsWith("Dr")) {
            System.out.println("Hello doctor, what did you study");

        } else if (name.startsWith("Madam")) {
            System.out.println("Hello Madam");

        }
        if (name.endsWith("Jr")) {
            System.out.println("Hello Junior");

        }else if (name.endsWith("Sr")){
            System.out.println("Hello senior");
        }









    }
}