package day32_array;

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

        //you could also do:
     //   String[] allZone = zones.split(",");

        for (String each : zones.split(",")) { // for (String each : allZone)){
            System.out.println("Deploying " + app + " to " + each); //allZone[i]
        }
 //       for (int i = o; i < allZones.length; i++) {
   //         System.out.println("Deploying " + app + " to " + allzone[i]);
  //      }
    }
}