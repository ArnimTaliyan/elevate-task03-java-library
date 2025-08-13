package Day3.features;

import Day3.services.Library;

import java.util.Scanner;

import static Day3.validation.Utils.getValidateBookId;

public class ReturnBook implements Feature {
    @Override
    public void execute(Scanner input, Library library) {
        int bookId = getValidateBookId(input, "Enter the Book ID to return: ");

        if (library.returnBook(bookId)) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("This book is not currently issued.");
        }
    }
}