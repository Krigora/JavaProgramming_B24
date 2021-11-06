package day08_relational_logical_operators;

public class GiftCard {

    /*
    gift card balance = 20
    item 1 price = 40
    item 2 price = 100

    calculate the remaining balance of gift card

    example output

    The gift card started with a balance of 200$ and after buyung item 1 for 40$ and item 2 for 100$. The ramaining balance of the gift card is 60$

     */

    public static void main(String[] args) {

        double balance = 200;
        System.out.println( "Gift card blance; " + balance);
        System.out.println(" buy item 1 and is cost $40");
        balance -=40;

        System.out.println(" gift card balance: " + balance );
        System.out.println("buy item 1 and is cost $100");

        balance -=100;
        System.out.println(" gift card balance: " + balance);




}






}
