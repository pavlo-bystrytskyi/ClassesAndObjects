package org.example;

import java.util.List;

//Step 1: Create a class 'Book' with the properties 'title', 'author', and 'isbn'. Implement getter and setter methods for these properties.
//
//Step 2: Override the toString method of the 'Book' class to display the book information in a readable format.
//
//Step 3: Create a class 'Library' with an array of 'Book' objects.
//
//Step 4: Override the toString method of the 'Library' class to display the information of the 'Library' in a readable format.
//
//Step 5: Create an instance of the 'Library' class with an array of 'Book' objects. Print the library information to the console.

import java.util.ArrayList;
import java.util.List;

// Implement methods to add and delete books from the library.
public class Main {
    public static void main(String[] args) {
        Book newBook = new Book("some title5", "some author7", "11111111121");
        Library library = new Library(
                new ArrayList<>(List.of(new Book("some title1", "some author3", "1111111111"),
                        new Book("some title2", "some author3", "1111111112"),
                        new Book("some title3", "some author3", "1111111113")
                )));

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
