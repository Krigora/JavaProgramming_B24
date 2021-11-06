package day09_scanner_logical;

public class EligibleToVote {

    public static void main(String[] args) {

        boolean isUsCitizen = true;
        int age = 3;
        boolean hasCriminalBackground = false;

        boolean isEligible = isUsCitizen && age >= 18 && !hasCriminalBackground ;

        System.out.println(isEligible);








    }
}
