package day44_Custom_Classes;

public class AllPeople {

    public static void main(String[] args) {

        // make Person object

        Person personOne = new Person(); // we made a Person object/ we made an instance of Person class
        personOne.name = "James Bond";
        personOne.age = 40;
 // age = 40; there is no local age
        personOne.hairColor = "Black";
        personOne.sex = 'M';
        personOne.isMarried = false;

// this will not print us anything useful, for new
        System.out.println(personOne);

        System.out.println("Name: " + personOne.name);
        System.out.println("Age: " + personOne.age);
        System.out.println("Hair color: " +  personOne.hairColor);
        System.out.println("Sex: " + personOne.sex);
        System.out.println("Married: " + (personOne.isMarried ? "yes" : "no"));


       //  System.out.println(Person.name); name cannot be accessed because it is not being used with an obl=ject




    }



}
