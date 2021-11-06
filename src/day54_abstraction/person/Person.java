package day54_abstraction.person;

public abstract  class Person {

    /*
    create subpackage: person

    Person (abstract)

        instance variables:

            name, age

        abstract method:

            sleep()

    Employee (abstract) inherits Person

        instance variables:
            job title, salary

        abstract method:

            work()

    Make Child classes of Employee and implements methods:

        Tester, Developer, Chef, Server
     */

    String name;
    int age;

    public abstract void sleep (int minutes);
}
