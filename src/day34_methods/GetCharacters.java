package day34_methods;

public class GetCharacters {
    /*
      Print each one in one line
    - make method that will print all the letters from A to Z
    - make method that will print all the letters from a to z
    - make method that will print all the letters from Z to A
    - make method that will print all the letters from z to a
    - make method that will print all the letters from 0 to 9
     */

    public static void main(String[] args) {
           printAToZInLowerCase();
           printAToZInUpperCase();
           print1To9();

    }


    public static void printAToZInUpperCase(){

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void printAToZInLowerCase() {
        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void printZToA() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
    }

    public static void printFour() {
        for (char i = 'Z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
    }
    public static void print1To9(){
        for (int i = '0'; i <= '9'; i++) {
            System.out.print((char) i + " ");


        }
    }
}