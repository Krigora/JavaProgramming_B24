package day45_constructors;

public class CarMarket {

    public static void main(String[] args) {

        Car vehicle = new Car();
        vehicle.Brandname = "BMW";
        vehicle.motor = 3.5;
        vehicle.isFree  = false;

        // assign value to variables

        System.out.println("Brand: " + vehicle.Brandname);
        System.out.println("motor: " + vehicle.motor);
        System.out.println("is Free: " + (vehicle.isFree ? "now" : "yes"));

        // calling update method

        vehicle.update();

        // printing our information

        System.out.println(vehicle);

        System.out.println("Car information");
        System.out.println("Brand: " + vehicle.Brandname);
        System.out.println("motor: " + vehicle.motor);
        System.out.println("is Free: " + (vehicle.isFree ? "now" : "yes"));



        }
    }

