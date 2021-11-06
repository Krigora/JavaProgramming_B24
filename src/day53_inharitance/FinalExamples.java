package day53_inharitance;

public class FinalExamples {
    final int a;
    public  static final String PLANET = "Earth";

    public FinalExamples(int a){
        this.a = a;
    }

    public static void main(String[] args) {
        FinalExamples obj = new FinalExamples(5);
        System.out.println(obj.a);
        // obj.a = 10; a is Final so we cannot change the value;
     //   PLANET = "Mars"; cannot reassign to final variables
    }
}
