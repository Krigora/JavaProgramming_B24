package day27_nested_loops;

public class NestedloopWithBreakAndContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++){
    //       if (i == 2){
     //          break;
     //       }
            System.out.println("first");

            for (int j = 1; j <=2; j++){
              if (j == 2){
                 break;
                }

                System.out.println("second");
            }
        }

    }

}
