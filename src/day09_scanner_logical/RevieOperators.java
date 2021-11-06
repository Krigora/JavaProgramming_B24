package day09_scanner_logical;

public class RevieOperators {

    public static void main(String[] args) {
        double budget = 1000;
        budget -= 200;

        boolean stillInBudget = budget >=0;
        System.out.println("Budget after purchace: " + budget);

        System.out.println("Still in budet:" + stillInBudget);

        budget -= 500; // budget = budget - 500;
        stillInBudget = budget >= 0;

        System.out.println(budget != 300); // 300 != 300
        System.out.println(budget != 300.5); // 300.0 != 300.5 -  true

        System.out.println(budget-- == 300); // 300 == 300 - true , budget = 299





        System.out.println("Budget after purchace: " + budget);

        System.out.println("Still in budet:" + stillInBudget);
        System.out.println(--budget == 299);  // 298 == 299 // budget = budget - 1

        System.out.println(budget++ == 299); // 298 == 299 = false? budget 299

        int i = 5;
        boolean b = (i = 3) == 5; // 3 == 5
        System.out.println(i);
        System.out.println(b);

        System.out.println(false == !true);  // false == false
        System.out.println(false != true);


    }

}
