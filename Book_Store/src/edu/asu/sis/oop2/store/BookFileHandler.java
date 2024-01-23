package edu.asu.sis.oop2.store;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookFileHandler {

    public ArrayList<Book> getAllBook() throws FileNotFoundException, IOException {
        ArrayList<Book> books = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get("data.txt"));
        for (String line : lines) {
            String[] row = line.split(",");
            Book book = new Book();
            book.setName(row[0]);
            book.setPrice(Double.parseDouble(row[1]));
            book.setAuthor(row[2]);
            books.add(book);
        }
        return books;
    }

    public void addBook(Book book) throws IOException {
        FileWriter fw = new FileWriter("data.txt", true);
        fw.append(book.getName() + "," + book.getPrice() + "," + book.getAuthor() + "\n");
        fw.flush();
        fw.close();
    }public void deleteBook(Book bookToDelete) throws IOException {
    ArrayList<Book> books = new ArrayList<>();

    List<String> lines = Files.readAllLines(Paths.get("data.txt"));
    for (String line : lines) {
        String[] row = line.split(",");
        Book book = new Book();
        book.setName(row[0]);
        book.setPrice(Double.parseDouble(row[1]));
        book.setAuthor(row[2]);
        if (!bookToDelete.equals(book)) {
            books.remove(book);
        }
    }

   
    FileWriter fw = new FileWriter("data.txt");
    for (Book book : books) {
        fw.append(book.getName() + "," + book.getPrice() + "," + book.getAuthor() + "\n");
    }
    fw.flush();
    fw.close();

    }
     public void updateInventory(Book oldBook, Book updatedBook) throws IOException {
        deleteBook(oldBook);
        addBook(updatedBook);
    }
    }
