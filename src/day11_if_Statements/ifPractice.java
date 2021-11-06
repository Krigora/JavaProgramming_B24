package day11_if_Statements;

public class ifPractice {

    public static void main(String[] args) {
        double hourlyRate = 10.5;
        double hoursWorked = 38;
        double netPay;

        String message;

        if (hoursWorked > 40){
            // overtime calculation
            double overTimeHours = hoursWorked - 40;
            netPay = 40 * hourlyRate;
            netPay += overTimeHours * hourlyRate *  1.5;

            message = " waw you work " + hoursWorked + " hours so you get paid for " + overTimeHours + " hous overtime " + netPay;

        } else {
            netPay = hoursWorked * hourlyRate;
            message = "You worker " + hoursWorked + " hours, your total net pay is " + netPay;
            
        }

        System.out.println(netPay);


    }
}
