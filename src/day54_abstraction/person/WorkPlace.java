package day54_abstraction.person;

import day53_inharitance.rules.D;

public class WorkPlace {
    public static void main(String[] args) {
       // Person person = new Person() { cannot create an object of Person because it is abstract class

     //   Employee employee = new Employee() {  cannot create an object of Employee because it is abstract class

        Tester tester = new Tester();
        tester.work();
        tester.sleep(30);
        tester.jobTitle = "Tester";

        System.out.println();


        Developer developer = new Developer();
        developer.work();
        developer.sleep(20);

        System.out.println();

        Chef chef = new Chef();
        chef.work();
        chef.sleep(45);






    }
}
