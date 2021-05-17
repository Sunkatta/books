package com.example.books;

import com.example.books.models.Book;
import com.example.books.models.Books;

public class Main {
    public static void main(String[] args) {
        Book theWitcher = new Book("1", "The Witcher", "A fantasy book following the adventures of Geralt of Rivia nand his friends");
        Book lotr = new Book("2", "Lord Of The Rings", "An epic story about the battle between good and evil");
        Book got = new Book("3", "A Song Of Ice And Fire", "Saga exploring the struggle for power among the noble families of Westeros (better than the series)");

        Books books = new Books();

        books.addBook(theWitcher);
        books.addBook(lotr);
        books.addBook(got);

        books.iterateBooks(book -> System.out.println(book.getHeading()));
    }
}
