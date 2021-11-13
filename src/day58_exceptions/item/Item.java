package day58_exceptions.item;

 /*
     instance variable name
    initialize name in constructor
    instance method: use()
        "using item"
     */

public class Item {

String name;

    public Item(String name) {
        this.name = name;
    }

    public void use(){
        System.out.println("Using item");
    }
}
