package my_utilities;

import day51_inheritance.Modifier.Modifier;

public class TestModifierWithInheritance extends Modifier {



    public static void main(String[] args) {

        Modifier obj = new Modifier();
        System.out.println(obj.A);
      //  System.out.println(obj.B);
       // System.out.println(obj.C);

        TestModifierWithInheritance obj2 = new TestModifierWithInheritance();
        System.out.println(obj2.A);
        System.out.println(obj2.B);

    }

}
