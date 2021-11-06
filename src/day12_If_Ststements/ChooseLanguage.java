package day12_If_Ststements;

import java.util.Scanner;

public class ChooseLanguage {

    /*
    add a new class ChooseLanguage
add main method
"Choose your language"
int selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          -----> "lets talk in english, hello"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Chooce you language.Enter anumber from 1-5");
        System.out.println("\t)English\n\t2)Spanish\n\t3)Turkish");
        int selection = input.nextInt();
        String message = "";
                if(selection == 1 ) {
                    message = "Hello, Thank for your call";
                } else if (selection == 2){
                    message = "hola. dfdddddd";

                } else if (selection == 3){
                    message = " ncdskvnd vnvffdjnv vavjad";

                } else {
                    message = " lets talk in english, hello";
                }
        System.out.println(message);

    }
}
