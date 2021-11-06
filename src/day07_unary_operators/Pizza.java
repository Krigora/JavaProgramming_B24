package day07_unary_operators;

public class Pizza {

 /*   pizza = "chees"
     pizza slices = 8
    people = 4
    calculate the slices per person

    Example output

    We Ordered cheese pizza with 8 slices, 4 people ate 2 slices each


  */

    public static void main(String[] args) {

        String type = "cheese";
        int pizzaSlices = 8;
        int people = 4;
        int slicesPerPerson = pizzaSlices / people;


        System.out.println("We ordered " + type + " pizza with " + pizzaSlices + " slices " + people + " peple ate " + slicesPerPerson + " slices each");
    }
}
