package day58_exceptions.item;

public class Store {

    public static void main(String[] args) {
        Eragon obj1 = new Eragon(); // itsself
        Book obj2 = new Eragon(); // parent
        Item obj3 = new Eragon();     // parent

        // also have interface for reference

        obj1.use();
        obj2.use();
        obj3.use();

       // new Book("").use();

        obj1.sell();
        ((Eragon)obj2).sell();
        Eragon newobj = (Eragon)obj3;
        newobj.sell();



    }
}
