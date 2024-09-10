/*
Brent Thompson, CEN 3024, 9/7/2024
Software Development 1


This Library Management Software is used to handle the storage of information, including
adding and removing books. Once the Library is created, a few books are added manually and then the
use is able to add new books to the collection.

The program requires the user to enter the contents of a text document in a specified format, ( 1, Title, Author).
Various outputs and update messages keep the user informed of changes.
 */

import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class LMS_App {
    public static void main(String[] args) {

// Instantiate Library
        Library thompson= new Library(0, "Thompson");
        System.out.println(thompson.toString());
        thompson.printBooks();
        System.out.println("Welcome to the library program! \n");

        // These two methods give a summary of the Library.
        System.out.println(thompson.toString());
        thompson.printBooks();

        System.out.println("Adding some of my favorite books to the Library.. \n");

        Book genesis = new Book(1996, "Genesis", "Moses");
        thompson.addBook(genesis);

        Book psalms = new Book(2021, "Psalms", "David");
        thompson.addBook(psalms);


        Book proverbs = new Book(2020, "Proverbs", "Solomon");
        thompson.addBook(proverbs);


        Book romans = new Book(2022, "Romans", "Paul");
        thompson.addBook(romans);

        // Showing the updated books in the library
        System.out.println("Current stats for the library: " + thompson.toString());
        thompson.printBooks();

        // Removing all but my favorite book, to demonstrate remove book function.

        thompson.removeBook(1996);
        thompson.removeBook(2021);
        thompson.removeBook(2020);

        System.out.println("Updated stats for the library: " + thompson.toString());
        thompson.printBooks();

        // Allow the user to input the contents of a text file, in 0 , 1 , 2 format(parts)
        System.out.println("Please paste the text file contents.. \n");
        Scanner scanner = new Scanner(System.in);

        // Looping through new lines of input, creating new books for library
        while (scanner.hasNextLine()) {
            try{
                String line = scanner.nextLine();
                if (line.equals("")) break;
                String[] parts = line.split(",");

                // Splitting the entry by " , " and using the parts as attributes of book
                int bookID = parseInt(parts[0]);
                String title = parts[1];
                String author = parts[2];

                Book bookId = new Book(bookID, title, author);
                thompson.addBook(bookId);

            } catch (Exception e){
                System.out.println("Something went wrong with the entry, try again with different inputs. \n");
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Those are great books! \n");

        System.out.println("Updated stats for the library: " + thompson.toString());
        thompson.printBooks();




        try{
            System.out.println("Enter the ID of the book to remove");
            String line = scanner.nextLine();
            int idToRemove = parseInt(line);

            thompson.removeBook(idToRemove);

        } catch (Exception e){
            System.out.println("No book with that ID found.");
        }

        scanner.close();
        thompson.printBooks();
    }
}
