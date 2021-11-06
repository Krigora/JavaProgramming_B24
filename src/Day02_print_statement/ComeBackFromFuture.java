package Day02_print_statement;

import day49_encapsulation.AccessModifier;

public class ComeBackFromFuture {

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.a = 1;
      //  obj.b = 2; b is default so it can only be accessed in the same packet
      //  obj.c = 3;  is private so we cannot access it outside of the class
    }
}
