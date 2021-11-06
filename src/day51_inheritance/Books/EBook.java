package day51_inheritance.Books;

import day51_inheritance.Books.Book;

public class EBook extends Book {

    double size;
    int pages;

    public void read(){
        System.out.println("Reading " + title );
    }

}
