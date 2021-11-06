package day55_abstraction.Learn_interface;

public class Spanish  implements Language{

    @Override
    public void hi() {
        System.out.println("Holla");
    }

    @Override
    public void bye() {
        System.out.println("Adios");

    }
}
