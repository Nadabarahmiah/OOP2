package edu.asu.sis.oop2.store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("======================");
            System.out.println("1- Add book");
            System.out.println("2- Show All book");
            System.out.println("3- delet book");
            System.out.println("4- Update book");
            System.out.println("5- Quit");
            System.out.println("======================");
            System.out.print("Please enter you choice: ");
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                    handleAddBook();
                    break;
                case 2:
                    handleShowAllBook();
                    break;
                case 3:
                   handleDeleteBook() ;
                    break;
                    case 4:
                  handleUpdateBook() ;
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    private static void handleShowAllBook() throws IOException {
        BookFileHandler handler = new BookFileHandler();
        ArrayList<Book> allBook = handler.getAllBook();
        System.out.println("name\tprice\tAuthor");
        for (Book book : allBook) {
            System.out.println(book.getName() + "\t" + book.getPrice() + "\t" + book.getAuthor());
        }
    }

    private static void handleAddBook() throws IOException {
        BookFileHandler handler = new BookFileHandler();
        Book book = new Book();
        System.out.print("Price: ");
        book.setPrice(s.nextInt());
        System.out.print("Name: ");
        book.setName(s.next());
        System.out.print("Author: ");
        book.setAuthor(s.next());
        handler.addBook(book);
    }

   private static void handleDeleteBook() throws IOException {
    BookFileHandler handler = new BookFileHandler();
    handleShowAllBook();
    System.out.print("Enter the name of the book to delete: ");
    String bookNameToDelete = s.next();
    Book bookToDelete = new Book();
    bookToDelete.setName(bookNameToDelete);
    handler.deleteBook(bookToDelete);
    
    System.out.println("Book deleted successfully.");}
   
    private static void handleUpdateBook() throws IOException {
        BookFileHandler handler = new BookFileHandler();
        handleShowAllBook();
        String bookNameToUpdate = s.next();
        Book oldBook = new Book();
        oldBook.setName(bookNameToUpdate);
        ArrayList<Book> existingBooks = handler.getAllBook();
        Book bookToUpdate = null;

        for (Book existingBook : existingBooks) {
            if (existingBook.getName().equals(bookNameToUpdate)) {
                bookToUpdate = existingBook;
                break;
            }
        }

        if (bookToUpdate == null) {
            System.out.println("Book not found. Update canceled.");
            return;
        }

        Book updatedBook = new Book();
        System.out.print("New Price: ");
        updatedBook.setPrice(s.nextDouble());
        System.out.print("New Author: ");
        updatedBook.setAuthor(s.next());

        handler.updateBook(oldBook, updatedBook);

        System.out.println("Book updated successfully.");
    }




   BookFactory f = new BookFactory();
    Book a1 = f.cr(1);
    Book a2 = f.cr(2);
   // a1.genre();
    //a2.category();

    SingletonBook test = SingletonBook.getInstance();
    //test.File();
}  
