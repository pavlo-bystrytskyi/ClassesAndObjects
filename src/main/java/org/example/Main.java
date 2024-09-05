package org.example;

import java.util.ArrayList;
import java.util.List;

// Implement methods to add and delete books from the library.
public class Main {
    public static void main(String[] args) {
        Book newBook = new Book("some title5", "some author7", "11111111121");
        Library library = new Library(
                new ArrayList<>(
                        List.of(
                                new Book("some title1", "some author3", "1111111111"),
                                new Book("some title2", "some author3", "1111111112"),
                                new Book("some title3", "some author3", "1111111113")
                        )
                )
        );

        System.out.println("Default library");
        System.out.println(library);
        library.addBook(newBook);
        System.out.println("Updated library");
        System.out.println(library);
        library.removeBook(newBook);
        System.out.println("Library after removal");
        System.out.println(library);
        library.removeBook(newBook);
        System.out.println("Library after non-existing book removal");
        System.out.println(library);
    }
}
