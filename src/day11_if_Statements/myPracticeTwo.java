package day11_if_Statements;

public class myPracticeTwo {

    /*
    [If statement, operators]
    Write a program that will accept a boolean value. Print out the opposite of the given boolean
    Ex: true -> false
    false -> true
     */
    public static void main(String[] args) {

        char world = 'm';
        if (world == 't'){
            System.out.println("false");

        } else {
            System.out.println("true");
        }


/*
Write a program that will accept your salary amount.
Then also ask the user if they are full time or not (boolean).
If they are fulltime add 20000 to their salary,
but if they are part time then subtract 5000.
Print the final salary.
 */

        double hoursWorked = 32;
        double salary = 100000;
        double finalSalary;



        if (hoursWorked > 40 ) {
            double fulltime = hoursWorked + 20000;
            finalSalary = salary + fulltime;
            System.out.println("Print the final salary: $" + finalSalary);
        } else {
            double partTime = hoursWorked - 5000;
            finalSalary = salary - partTime;
            System.out.println("Print the final salary: $" + finalSalary);

        }







    }

}