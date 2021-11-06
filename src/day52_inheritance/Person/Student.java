package day52_inheritance.Person;

import day52_inheritance.Person.PersonAndChildren;

public class Student extends PersonAndChildren {

    String schoolName;

    public Student(String name, int age, double birthYear, String schoolName){
       super(name, age, birthYear);
       this.schoolName = schoolName;
    }
    public void Study(){
        System.out.println(name + " is studding at " + schoolName);
    }
}
