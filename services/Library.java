package Day3.services;

import Day3.models.Book;
import Day3.models.User;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> availableBooks = new ArrayList<>();

    private List<User> registeredUsers = new ArrayList<>();

    public void addUser(User user) {
        registeredUsers.add(user);
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }

    public void initBooks() {
        availableBooks.add(new Book(1, "The Alchemist", "Paulo Coelho", 1988));
        availableBooks.add(new Book(2, "1984", "George Orwell", 1949));
        availableBooks.add(new Book(3, "To Kill a Mockingbird", "Harper Lee", 1960));
    }
}