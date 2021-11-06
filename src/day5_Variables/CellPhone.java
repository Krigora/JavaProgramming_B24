package day5_Variables;

public class CellPhone {
    public static void main(String[] args ) {

        String brand =  "Samsung" ;
        String model = "note 10+" ;
        String color = "black" ;
        double price = 1099.99;
        int storage = 256;
        boolean hasCamera = true;

        color = "Silver";




        System.out.println("information for the " + model );
        System.out.println(model + " is a" + brand + " phone ");
        System.out.println("This phone comes in " + color + " and has " + storage + "GB of memory ");
        System.out.println(" Has a camera: " + hasCamera);
        System.out.println("All of this for $" + price);

        System.out.println(brand + " " +  model);

        System.out.println();

        String info = "\t\t\tinformation for the " + model + "\n" + model + " is a" + brand + " phone " + "\nThis phone comes in " + color + " and " +
                "has " + storage + "GB of memory\n" + "Has a camera: " + hasCamera + "\nAll of this for $" + price;

        System.out.println(info);



    }

}
