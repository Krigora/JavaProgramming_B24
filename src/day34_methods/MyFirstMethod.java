package day34_methods;

public class MyFirstMethod {
// this method prints hello word
    public static void helloWorld(){
        System.out.println("Hello World");
    }

    public static void helloWord50Times(){
        for (int i = 0; i < 50; i++){
            System.out.println("Hello Word");
        }
    }


//   the main is used to call our method
    public static void main(String[] args) {
        helloWorld();
        helloWorld();

       helloWord50Times();

        System.out.println();

        helloWord50Times();
        }
    }

