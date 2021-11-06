package day05_Variables;

public class CarDriverInfo {
    /*
    carModel -> String
    driverName  -> String
    licenseNum  -> String
    speed       -> short
    isAutomatic -> boolean
    licenseClass-> char
     */

    public static void main(String[] args) {

        String carModel = "Maybach";
        String driverName = "Ihor";
        String licenseNum = "UA22UA";
        Short speed = 300;
        Boolean isAutomatic = true;
        char licenseClas = 66;

        System.out.println("There is " + carModel);
        System.out.println("Driver name is " + driverName);
        System.out.println("He has license: " + licenseNum + " and Clas " + licenseClas);
        System.out.println("Maximum speed:" + speed + "mph");
        System.out.println("Automatic Transmission:\t" + isAutomatic);






    }

}
