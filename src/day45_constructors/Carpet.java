package day45_constructors;

public class Carpet {

    /*
    info
    width, length. unit price, if its persian, total price

    constructor:

    initialize the variable 4

    calculate the total price:
    w * l * unit price
    if its persian add 200$
    toString to print the total price
     */

    /*
     info
        width, length. unit price, if its persian, total price
     */
    double width;
    double length;
    double unitPrice;
    boolean itsPersian;
    double totalPrice;

/*
constructor:
    initialize the variable 4
 */

    public Carpet(double newWidth, double newLength, double newUnItPrice, boolean newItsPersian) {
        width = newWidth;
        length = newLength;
        unitPrice = newUnItPrice;
        itsPersian = newItsPersian;

            /*
            calculate the total price:
    w * l * unit price
    if its persian add 200$
             */
        totalPrice = width * length * unitPrice;
        if (newItsPersian) {
            totalPrice += 200;


        }

    }

    /*
    toString to print the total price
     */
    @Override
    public String toString() {
        return "Carpet{" +
                "width: " + width +
                ", length: " + length +
                ", unitPrice: " + unitPrice +
                ", itsPersian: " + itsPersian +
                ", totalPrice: " + totalPrice +
                '}';
    }
}