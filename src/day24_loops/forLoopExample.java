package day24_loops;

public class forLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);

        }


       // System.out.print(i); i is not visible outsids of the loop

/*
Flow of for loop:
- it executes the initialization part to declare the variable:
       int i  = 1;
       - once in the beginning of the loop
 - checks the boolean / termination condition part
 i <= 10;

 if the boolean is true : the loop will run
 if the boolean is false: the loop stops

 - next the loop body, statements inside if the loop

  System.out.print(i);

   - next the update part is run
   i++

   - repeat the steps by cheking the boolean/ ternination condition part
   i <=10;



 */

    }
}
