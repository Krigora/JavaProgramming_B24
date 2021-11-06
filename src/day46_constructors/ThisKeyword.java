package day46_constructors;

public class ThisKeyword {

    int a = 100; // instance variable
    public ThisKeyword(int a){ // a is the local variable

        a = 400; // raessing the local a to be 400
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(200);
        System.out.println(obj.a);


    }
}
