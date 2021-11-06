package day5_Variables;

public class House {

    /*
  house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),- Print each variable with a message with the valueEx: The number of bedrooms is: 4 The number of bathrooms is: 3
     */
    public static void main(String[] args) {

        String houseType = "single family";
        short numberOfBedrooms = 4;
        short numberOfBathrooms  = 2;
        short numberOfKitchens = 1;
        boolean isThereABasement = true;
        boolean isThereAnAttic = true;
        boolean isThereAPool = true;
        boolean isItForSale = true;
        long costOfTheHouse = 980000;
        String address  = "Planet Earth street";
        long zipCode = 77777;
        boolean isParkNearBy = true;
        short schoolRating = 2;

        System.out.println();

        System.out.println("This House is located: " + address + ",\t" + zipCode + "." );
        System.out.println("It is a " + houseType + " house.");
        System.out.println("It has " + numberOfBathrooms + " bathrooms," +  numberOfBedrooms + " bedrooms, " +  numberOfKitchens + " kitchen."  );
        System.out.println("Has a basement:"  + isThereABasement + ", " + "also there is an attic:" +  isThereAnAttic + ".");
        System.out.println("It has a pool : " + isThereAPool + ".");
        System.out.println("There is a park near by : " + isParkNearBy + ".");
        System.out.println("It is up for sale now : " + isItForSale + ".");
        System.out.println("Asking price is :"  + "$" + costOfTheHouse);








    }
}
