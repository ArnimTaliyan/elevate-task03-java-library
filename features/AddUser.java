package Day3.features;

import Day3.models.User;
import Day3.services.Library;

import java.util.Scanner;

import static Day3.validation.Utils.getValidateUserId;

public class AddUser implements  Feature {
    public void execute(Scanner input, Library library) {
        int id = getValidateUserId(input, "Enter User ID: ");

        input.nextLine();

        System.out.print("Enter User Name: ");
        String userName = input.nextLine();

        User user = new User(id, userName);
        library.addUser(user);

        System.out.println("User added successfully!");
    }
}