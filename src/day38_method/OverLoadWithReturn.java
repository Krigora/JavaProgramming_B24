package day38_method;

public class OverLoadWithReturn {

    public static void method(){
        System.out.println("void method - no params");
    }

    public static int method(int a){
        System.out.println("int method - no params");
        return 0;
    }

    public static String method(String  s){
        System.out.println("String method - no params");
        return "";
    }



}
