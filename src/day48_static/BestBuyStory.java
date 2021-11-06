package day48_static;

public class BestBuyStory {
    public static void main(String[] args) {
        BestBuy storyOne = new BestBuy("Main St");
        BestBuy storyTwo = new BestBuy("Oak Drive");

        System.out.println(storyOne.location);
        System.out.println(storyTwo.location);

        System.out.println(BestBuy.day);
        System.out.println(storyOne.day);
        System.out.println(storyTwo.day);

        BestBuy.day = "Sunday";
      //  storyOne.day = "Sunday";
      //  storyTwo.day = "Sunday";

        // kubes 18,19,20 all would change the day

        System.out.println(BestBuy.day);
        System.out.println(storyOne.day);
        System.out.println(storyTwo.day);







    }
}
