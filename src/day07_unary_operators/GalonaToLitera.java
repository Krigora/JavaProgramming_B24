package day07_unary_operators;

public class GalonaToLitera {

    /*
    Ex:galon = 10;output:10 gallons equal to 37.8541 litersgalon = 20output:20 gallons equal to 75.7082 liters
     */
    public static void main(String[] args) {

        int galon = 10;
        double litera = 37.8541;
        double oneLitera = litera / galon;

        System.out.println(oneLitera);
        System.out.println(galon + " gallons equal to " + litera + " litera" );

    }

}
