package com.example.books.models;

public class Book {
    private String isbn;
    private String heading;
    private String description;

    public Book() {
    }

    public Book(Book book) {
        setIsbn(book.isbn);
        setHeading(book.heading);
        setDescription(book.description);
    }

    public Book(String isbn, String heading, String description) {
        setIsbn(isbn);
        setHeading(heading);
        setDescription(description);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
