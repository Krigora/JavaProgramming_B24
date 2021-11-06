package day49_encapsulation;

public class Traffic {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red");
        //cannot access color directly anymore
      //  System.out.println(light.color);

     //  light.color = "brown";

       System.out.println(light.getColor());
     //  light.setColor = "green": -> we can not change direcly
        light.setColor("green");
        System.out.println(light.getColor());

        light.setColor("brown");
        System.out.println(light.getColor());


    }
}
