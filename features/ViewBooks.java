package Day3.features;

import Day3.models.Book;
import Day3.services.Library;

import java.util.Scanner;

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