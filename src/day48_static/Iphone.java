package day48_static;

import java.util.Locale;

public class Iphone {
    /*
        iPhone

        instance variable:
            model, color, price, storage

        static variable:
            brand, operating system (os)

        constructor
            initialize all 4 variables

            optional: create another constructor that only needs model and price

        static block:
            initialize brand : Apple
            initialize os: IOS
     */

    String model;
    String color;
    double price;
    int storage;

    static String brand;
    static String operationsSystem;

    static {
        brand = "Apple";
        operationsSystem = "IOS";
    }

    public Iphone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public Iphone(String model, String color, double price, int storage) {
        this(model, price);
        this.color = color;
        this.storage = storage;
    }

    @Override
    public String toString() {
        if (color != null && storage != 0) {
            return "Iphone{" +
                    "model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    ", storage=" + storage +
                    '}';
        } else {
            return "Iphone{" +
                    "model='" + model + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

}
