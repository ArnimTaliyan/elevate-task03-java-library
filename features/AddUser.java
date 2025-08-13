package features;

import java.util.Scanner;
import models.User;
import services.Library;
import static validation.Utils.getValidateUserId;

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