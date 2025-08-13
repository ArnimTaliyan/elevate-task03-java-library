package features;

import java.util.Scanner;
import models.Book;
import services.Library;

public class ViewBooks implements Feature {
    @Override
    public void execute(Scanner input, Library library) {
        System.out.println("Available Books:");
        if (library.getAvailableBooks().isEmpty()) {
            System.out.println("No books available at the moment.");
        } else {
            for (Book book : library.getAvailableBooks()) {
                System.out.println(book);
            }
        }
    }
}