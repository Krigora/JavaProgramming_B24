package day58_exceptions.item;

 /*
      child of Item class
    set name as "Book"
    override use method
        reading book
     */

public class Book extends Item{

    public Book(String name){
        super(name);
    }

    @Override
    public void use(){
        System.out.println("Reading a Book");
    }

}
