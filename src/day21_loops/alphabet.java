package day21_loops;

public class alphabet {
    /*
    print the letter from a - z
     */
    public static void main(String[] args) {

        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter++ + " ");

        }

        System.out.println();
        char letter2 = 'z';
        while (letter2 >= 'a')
            System.out.print(letter2-- + " ");


        String [] pl = {"kj", "jhj", "hdh", "Jh"};
        int x = pl.length;
        int y = pl[1].length();
        System.out.println(x + " " + y);

    }



}
