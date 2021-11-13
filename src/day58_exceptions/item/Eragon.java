package day58_exceptions.item;

 /*
   child of Book class
    set name as "Eragon"
    override use method
        reading Eragon
    */

public class Eragon extends Book{

    public Eragon(){
        super("Eragon");
    }

    @Override
    public void use() {
        System.out.println("Reading Eragon");
    }

    public void sell(){
        System.out.println("Selling Eragon books");
    }
}
