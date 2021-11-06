package day51_inheritance.Books;

public class AudioBook extends Book {

   double duration;
   String narrator;

   public void listen(){
      System.out.println("listening to " + title + "narrated by " + narrator);
   }

}
