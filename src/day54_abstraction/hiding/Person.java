package day54_abstraction.hiding;

public class Person {

    String name = "james Bond";

}

class Baby extends Person{
    String name = "Ihor"; // by creating another name variable in the sub clss, he hide the name from the parent

}
class Runner{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        Baby baby = new Baby();
        System.out.println(baby.name);
    }
}