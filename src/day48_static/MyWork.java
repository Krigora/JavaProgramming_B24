package day48_static;

public class MyWork {
    /*
     class name: Car
            instance variables:
                    brand, model, year, price, color

            1st constructor: initialize the brand of the car

            2nd constructor: initialize the brand and model of the car

            3rd constructor: initialize the brand, model, year of the car

            4th constructor: initialize the brand, model, year, price of the car

            5th Constructor: initialize all instances of the car

            Instance methods:
                toString()
     */

    String brand;
    String model;
    double year;
    long price;
    String color;

    public MyWork (String brand){
        this.brand = brand;
    }
    public MyWork (String brand, String model){
        this(brand);
        this.brand = model;
    }
    public MyWork (String brand, String model, double year){
        this(brand, model);
        this.year = year;
    }
    public MyWork (String brand, String model, double year, long price){
        this(brand, model, year);
        this.price = price;
    }

    public MyWork (String brand, String model, double year, long price, String color){
        this(brand, model, year, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "MyWork{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
