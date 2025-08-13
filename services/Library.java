package services;

import java.util.ArrayList;
import java.util.List;
import models.Book;
import models.User;

public class Library {
    private List<Book> availableBooks = new ArrayList<>();
    private List<User> registeredUsers = new ArrayList<>();
    private List<Book> issuedBooks = new ArrayList<>();

    public void addUser(User user) {
        registeredUsers.add(user);
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }
    
    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void initBooks() {
        availableBooks.add(new Book(1, "The Alchemist", "Paulo Coelho", 1988));
        availableBooks.add(new Book(2, "1984", "George Orwell", 1949));
        availableBooks.add(new Book(3, "To Kill a Mockingbird", "Harper Lee", 1960));
    }

    public boolean issueBook(int bookId) {
        for (Book book : availableBooks) {
            if (book.getId() == bookId) {
                issuedBooks.add(book);
                availableBooks.remove(book);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(int bookId) {
        for (Book book : issuedBooks) {
            if (book.getId() == bookId) {
                availableBooks.add(book);
                issuedBooks.remove(book);
                return true;
            }
        }
        return false;
    }
}