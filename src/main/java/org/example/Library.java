package org.example;

import java.util.Arrays;

public class Library {
    private Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
