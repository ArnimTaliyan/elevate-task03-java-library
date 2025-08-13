package features;

import java.util.Scanner;
import models.Book;
import services.Library;

public class ViewIssuedBook implements Feature{
    @Override
    public void execute(Scanner input, Library library) {
        System.out.println("Issued Books:");
        if (library.getIssuedBooks().isEmpty()) {
            System.out.println("No books are currently issued.");
        } else {
            for (Book book : library.getIssuedBooks()) {
                System.out.println(book);
            }
        }
    }
}