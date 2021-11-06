package day46_constructors;

public class MyOffer {
    public static void main(String[] args) {
        offer first = new offer("Chase", 150_000, true);
        System.out.println(first);

        offer second = new offer("Chicago", "Bank of America", 155_000, false, 15);
        System.out.println(second);

    }
}
