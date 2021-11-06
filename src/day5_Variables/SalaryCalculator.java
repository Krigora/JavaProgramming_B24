package day5_Variables;

public class SalaryCalculator {

    /*
     variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
     */

    public static void main(String[] args) {

       double salary = 1000000;
       double stateTaxRate = 0.08;
       double federalTaxRate = 0.21;

       double stateTax, federalTex, totalTax, salaryAfterTax;

       stateTax = salary * stateTaxRate;
       federalTex = salary * federalTaxRate;
       totalTax = stateTax + federalTex;
       salaryAfterTax = salary - totalTax;

        System.out.println("With thees values:");
        System.out.println(" Salary:" + salary);
        System.out.println("State tax rate:" + stateTaxRate);
        System.out.println("Federal tax rate:" + federalTaxRate);

        System.out.println();

        System.out.println("Total tax amount were:");
        System.out.println("State tax: " + stateTax);
        System.out.println("Federal tax:" + federalTex);
        System.out.println("Total tax rate: " + totalTax);
        System.out.println("Salary after tax:" + salaryAfterTax);








    }

}
