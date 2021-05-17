package com.example.books.models;

import com.example.books.interfaces.BookOperation;

import java.util.HashMap;

public class Books {
    private final HashMap<String, Book> books;

    public Books() {
       this.books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void deleteBookByISBN(String isbn) {
        books.remove(isbn);
    }

    public int countBooks() {
        return books.size();
    }

    public void iterateBooks(BookOperation bookOperation) {
        books.forEach((isbn, book) -> bookOperation.operation(book));
    }
}
