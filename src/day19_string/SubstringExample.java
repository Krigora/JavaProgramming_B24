package day19_string;

public class SubstringExample {

    public static void main(String[] args) {
        /*
        substring allows you to take part of the String based on the given index number
        when yo give one number, that is that starting of you subsrting and it keep all the characters until the end
         */
//                  0123456789
        String s = "javascript";

        System.out.println(s.substring(0));
        System.out.println(s.substring(3));
        System.out.println(s.substring(5));
        System.out.println(s.substring(7));

        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(4));

        System.out.println(s.substring(0, 8));


    }
}
