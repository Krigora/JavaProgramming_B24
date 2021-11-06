package day44_Custom_Classes;

public class Animal {


    // instance variable
    String species;
    String size;
    int numberOfLegs;
    boolean canFly;
    boolean isMammal;
    double weight;
    double lifeSpan;

    // methods

    // no static means these are instance method
    public void eat(){
        System.out.println(species + " is eating");
    }

    public void sleeping(){

        System.out.println("This " + size + " animal is sleeping");
    }





}
