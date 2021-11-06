package day39_wrapper_arraylist;

public class wrapperExample1 {
    public static void main(String[] args) {

        int a = 5;
        // you cannot use method from it. EX: a.method()
        // you can: print, assign/reassign, calculations, casting
        Integer i1 = new Integer(10);
        Integer i2 = 100;// this converts int primitive to Integer wrapper class

        System.out.println(i2);
        System.out.println(i1);

        byte b = 4;
        Byte b2 = new Byte((byte) 5);
        Byte b3 = (byte)500;
        Byte b4 = 100;
        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println();

        short s = 100;
        Short s2 = new Short((short) 200);
        Short s3 = 300;

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

        long l = 1000L;
       Long l2 = new Long(2000L);
        Long l3 = 3000L;

        System.out.println(l);
        System.out.println(l2);
        System.out.println(l3);

        Float f1 = new Float(4.5F);
        Float f2 = 4.7f;


    }
}
