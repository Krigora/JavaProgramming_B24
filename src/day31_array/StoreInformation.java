package day31_array;

public class StoreInformation {
    public static void main(String[] args) {

        /*
        Given the following table make three separate arrays to hold the values of the items (String), the prices (double), and the item ids (int)

        -Make the 3 arrays for the separate items with their information
        -Print the arrays to see all the information
        -Then go through and find the information of the most expensive item
        -Print the item name,price,and id
         */

        String [] items = {"Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack"};
        int    [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350};
        double [] prices =  { 89.99, 150.0,  9.99, 250.0, 439.5, 39.99};

        // Find out if the store has jackets

        boolean hasJackets = false;

        for (String eachItem : items ){
            if (eachItem.equals("Jackets")){
                hasJackets = true;
                break;
            }
        }
if (hasJackets){
    System.out.println("Yes we have jackets, Do you want same?");
} else {
    System.out.println( "No sorry, we don't have jackets");
}
// print all the information
        // Item id  | name | price

      for (int i = 0; i < items.length; i++){
          System.out.println(itemIds[i] + " | " + items[i] + " | $" + prices[i]);
      }
        System.out.println();

// Find the information of the most expensive item

        double maxPrice = prices[0];
        int indexOfMax = 0;

        for (int i = 0; i < prices.length; i++){

            if (prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("The most expensive item");
        System.out.println("Item Id: " + itemIds[indexOfMax]);
        System.out.println("Name: " + items[indexOfMax]);
        System.out.println("Price: " + prices[indexOfMax]);
    }
}
