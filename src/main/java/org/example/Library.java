package org.example;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books.toString() +
                '}';
    }
}
