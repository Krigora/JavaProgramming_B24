package day35_methods;

public class CountingNumbers {

    /*
    ver 1: Define a method that will count number from 0 to 5 print rhe numbers in one line

    Ver 2: Define another method that will count number from 0 to a given number (parameter)
     */
    public static void main(String[] args) {
        countNumbersFrom0To5();
        countNumbersFrom0ToN(10);
        countNumbersFrom0ToN(6);
        countNumbersFrom0ToN(15);


    }
public static void countNumbersFrom0ToN(int n){
        for (int i=0; i <= n; i++){
            System.out.print(i + " ");
        }
    System.out.println();
}

    static public void countNumbersFrom0To5(){
        for (int i = 0; i <= 5; i++){
            System.out.print(i + " ");

        }
        System.out.println();
    }

}
