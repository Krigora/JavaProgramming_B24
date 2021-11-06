package day45_constructors;

public class item {

    String name;
    double price;

    @Override
    public String toString() {
        return "item{" +
                "name: '" + name + '\'' +
                ", price: " + price +
                '}';
    }
}
