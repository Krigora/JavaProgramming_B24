package day51_inheritance.Books;

import day51_inheritance.Books.AudioBook;
import day51_inheritance.Books.Book;
import day51_inheritance.Books.EBook;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book();
        bookOne.title = "jAMES bOND";

        EBook bookTwo = new EBook();
        bookTwo.title = "Mindset";
        bookTwo.size = 50;
        bookTwo.read();

        AudioBook bookThree = new AudioBook();
        bookThree.title = "Leaders eat last";
        bookThree.duration = 25;
        bookThree.listen();
    }

}
