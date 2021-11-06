package day19_string;

public class IndexOfExample {

    public static void main(String[] args) {

        // charAt = takes a number(index) and given back a char

        // indexOf = takes a char/Srting and gives back the position/index/number
//             0 1 2 3
 String s = "java";
        System.out.println(s.indexOf('j')); // 0
        System.out.println(s.indexOf('a')); // 1
        System.out.println(s.indexOf('z')); // -1
        System.out.println(s.indexOf('v')); // 2


        System.out.println(s.indexOf("ja")); // 0
        System.out.println(s.indexOf("ava")); // 1
        System.out.println(s.indexOf("Va")); // -1
        System.out.println(s.indexOf("Va")); //2


    }
}
