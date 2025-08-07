package Day3.validation;

import java.util.Scanner;

public class Utils {
    public static int getValidateChoice(Scanner input, String prompt) {
        System.out.print(prompt);

        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            input.next();
        }
        return input.nextInt();
    }

    public static String getValidatedReRun(Scanner input, String prompt) {
        System.out.print(prompt);
        String response = input.next();
        while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
            System.out.print("Invalid choice. Please enter y or n: ");
            response = input.next();
        }
        return response;
    }

    public static int getValidateUserId(Scanner input, String prompt) {
        System.out.print(prompt);

        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            input.next();
        }
        return input.nextInt();
    }
}