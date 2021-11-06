package day52_inheritance.Person;

import day52_inheritance.Person.PersonAndChildren;

public class Employee extends PersonAndChildren {

    String jobTitle;
    boolean isFullTime;

    public void wokr(){
        System.out.println( name + " is working as " + jobTitle);
    }



}
