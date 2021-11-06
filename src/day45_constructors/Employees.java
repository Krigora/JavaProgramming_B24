package day45_constructors;

import java.util.Arrays;

public class Employees {

    /*
    Task:
    create a class called Employee
        - data:
            name, id, job title, salary
        - constructor

            should have 4 parameters, one for each instance variable
            parameter names need to be unique
                name -> inputName
                WRONG X con(name, id, title, salary)
                DO it -> con(inputName, inputId, inputTitle, inputSalary)

            initialize the instance variables

        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information


    work the task, as much as you can until 3:05 est


     */
    /*
    create a class called Employee
        - data:
            name, id, job title, salary
     */

    String name;
    int id;
    String jobTitle;
    double salary;

    /*
    - constructor
            should have 4 parameters, one for each instance variable
            parameter names need to be unique
                name -> inputName
                WRONG X con(name, id, title, salary)
                DO it -> con(inputName, inputId, inputTitle, inputSalary)

            initialize the instance variables
     */

    public Employees(String inputName, int inputId, String inputJobTotle, double inputSalary) {
        name = inputName;
        id = inputId;
        jobTitle = inputJobTotle;
        salary = inputSalary;

    }
    /*
    toString()
                print all the employees information
     */

    @Override
    public String toString() {
        return "Employees|" +
                "name: " + name +
                ", id: " + id +
                ", jobTitle: " + jobTitle +
                ", salary=" + salary +
                '|';
    }
    /*
     - method:
            goToMeeting()
                when this method is called print:
                    $name is going to a meeting
     */

    public void goToMeeting() {
        System.out.println(name + "is going to a meeting");

    }

    public static void main(String[] args) {
        Employees peoples = new Employees("Pedro", 007, "Bond", 20212);
        peoples.goToMeeting();
        System.out.println(peoples);

        Employees [] staff = new Employees[3];
        staff[0] = peoples;
        staff[1] = new Employees("Nadir", 10, "SDET", 300_000 );



        System.out.println(Arrays.toString(staff));


    }

}



