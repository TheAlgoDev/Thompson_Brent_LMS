/*
The Book class is used to represent a unique book, along with the books title and author. The book objects are intended
to be used with the library, the same as in a physical library.
 */
package com.library;

public class Book {
    // Attributes of a book
    public int id;
    public String title;
    public String author;

    // Constructor
    public Book(int ID, String title, String author) {
        this.id = ID;
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public void setID(int ID) {
        this.id = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    /* Over-ridden toString method to print out details of a book
            Returns a print message to display details of books
    */
    @Override
    public String toString() {
        return "Book ID: " + getID() + "\nTitle:    " + getTitle() + "\nAuthor: " + getAuthor() + "\n";
    }
}
