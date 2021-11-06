package day52_inheritance.Person;

import java.util.ArrayList;

public class PersonAndChildren {

    /*
    Task:

    Person
        name, age, birthYear, hobbies

        walk()

    child of Person:

        Student
            schoolName

            study()

        Employee
            jobTitle, isFullTime

            work()

        child of Employee:

            Tester

            Developer
     */

    String name;
    int age;
    double birthYear;
    ArrayList<String> hobbies;

    public PersonAndChildren (){

    }

    public PersonAndChildren (String name, int age, double birthYear){
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
        hobbies = new ArrayList<>();


    }

    public void walk(){
        System.out.println(name + " is walking");
    }
}
