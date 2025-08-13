package Day3.features;

import Day3.services.Library;

import java.util.Scanner;

import static Day3.validation.Utils.getValidateBookId;

public class IssueBook implements Feature{
    @Override
    public void execute(Scanner input, Library library) {
        int bookId = getValidateBookId(input, "Enter a Book ID to issue: ");

        if (library.issueBook(bookId)) {
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book not available.");
        }
    }
}