package day05_Variables;

public class WatchInfo {

    /*
    brand, color, price, waterResistant, isSmart
     */
 public static void main(String[] args) {

     String brand =  "Apple" ;
     String color = "blue ocean" ;
     double price = 1099.99;
     boolean waterResistant = true;
     boolean isSmart = false;

     System.out.println(" information for the watch " + brand );
     System.out.println("This watch comes in " + color + " color " );
     System.out.println("Has a smart: " + isSmart);
     System.out.println("Has a water resistant: " + waterResistant);
     System.out.println("All of this for $ " + price);

     System.out.println();

     String info = "\t\tinformation for the watch " + brand + "\n" + "This watch comes in " + color + " color "
             + "\nHas a smart " + isSmart + "Has a water resistant " + waterResistant + "\nAll of this for $" + price;
     System.out.println(info);











 }




}
