package Day04_Variables;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class fruits {
    public static void main(String[] args){

        int apples = 10;
        int grapes = 19;
        int bananas = 20;

        System.out.println("Number of apples: " + apples );
        System.out.println("Number of grapes: " + grapes );
        System.out.println("Number of bananas:" + bananas );

        int totalNumberOfFruits = apples + grapes + bananas;

        System.out.println("Total number of fruits:" + totalNumberOfFruits);


        apples = 50;
        totalNumberOfFruits = apples + grapes + bananas;


        System.out.println("After shipment");
        System.out.println("Number of apples: " + apples );
        System.out.println("Number of grapes: " + grapes );
        System.out.println("Number of bananas:" + bananas );
        System.out.println("Total number of fruits:" + totalNumberOfFruits);
    }


}
