package day54_abstraction.person;

public class Server  extends Employee{
    @Override
    public void work() {
        System.out.println();
    }

    @Override
    public void sleep(int minutes) {
        System.out.println();
    }
}
