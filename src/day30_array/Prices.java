package day30_array;

public class Prices {
    public static void main(String[] args) {

        double [] prices = {9004, 40.24, 140.41};

        for (int i = 0; i < prices.length; i++){
            System.out.println("$" + prices[i]);

        }
        System.out.println();

        for ( double each : prices){
            System.out.println("$" + each);
        }




    }
}
