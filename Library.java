/*
The Library class is used to store a set of Books for access by a console user. Key functions
include being able to add and remove books, as well as print a list of books that are in the Library.

Inputs for a Library are objects of Book class
 */

import java.util.ArrayList;
import java.util.HashSet;

public class Library {

    // Attributes of a Library
    private ArrayList<Book> books;
    private HashSet<String> bookIds;
    private static int size;
    private static String name;

    // Constructor
    public Library(int size, String name) {
        this.books = new ArrayList<>();
        this.bookIds = new HashSet<>();
        this.size = size;
        this.name = name;
    }

    // OverLoaded Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.bookIds = new HashSet<>();
        this.size = 0;
        this.name = "Local";
    }

    // Getters and Setters
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// Methods
/*
    Add book is used to add a book object to a library, and add to the size of the library

       Returns an updated library object
 */
    public void addBook(Book book) {
        books.add(book);
        size += 1;
    }
/*
    Remove book allows the user to remove a book using its ID.

        Returns an updated library object
 */
    public void removeBook(int idToRemove) {
        boolean removed = books.removeIf(Book -> Book.getID() == idToRemove);
        if (removed) {
            size -= 1;
            System.out.println("Book with ID " + idToRemove + " removed from the system. ");
        }
    }
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book + "\n-----------------------");
        }
    }

/*
    Over-ridden toString method to be able to print details of the library

        Returns a string of text that contains information about the library
 */
    @Override
    public String toString() {
        return "Library details [Library Size=" + size + ", name=" + name + "]\n";
    }


}