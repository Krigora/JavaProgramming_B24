package day38_method;

public class TypePromotions {

    public static void main(String[] args) {

        use(3);
        use(5.5);
        use(3.2f);

        byte b = 10;
        use(b);


    }

    public static void use(float f){
        System.out.println("Using the float method");
    }
    public static void use(double d){
        System.out.println("Using the double method");
    }

    public static void use(long l){
        System.out.println("Using the long method");
    }
}
