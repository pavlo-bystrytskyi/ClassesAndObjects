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

    public void addBook(Book book) {
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }

    public void removeBookByIsbn(String isbn) {
        boolean found = false;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                found = true;
                break;
            }
        }
        if (!found) {
            return;
        }

        int modifier = 0;
        Book[] result = Arrays.copyOf(this.books, this.books.length - 1);
        for (int i = 0; i < this.books.length; i++) {
            Book book = this.books[i];
            if (!book.getIsbn().equals(isbn)) {
                result[i - modifier] = book;
            } else {
                modifier++;
            }
        }
        this.books = result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
