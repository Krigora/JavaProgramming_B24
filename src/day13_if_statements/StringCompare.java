package day13_if_statements;

public class StringCompare {

    public static void main(String[] args) {

        String city = "Chicago";

        if (city.equals("Virginia")) {
            System.out.println("City is Virginia");
        } else {
            System.out.println("City is not Virginia");
        }
        if (city.equals("Chicago")){
            System.out.println("City is is Illinois");
        } else {
            System.out.println("City is not illinois");
        }
        String str = "java";
        String str2 = "javascript";
        if (!str.equals(str2)) { // str == str2
            System.out.println("String are not equal");
        } else {
            System.out.println("String are equal");
        }
        // !false - true

    }
}
