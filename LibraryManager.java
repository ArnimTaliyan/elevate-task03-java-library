package Day3;

import Day3.features.Feature;
import Day3.menuAndChoices.FeatureFactory;
import Day3.services.Library;

import java.util.Scanner;

import static Day3.menuAndChoices.Menu.menuDisplay;
import static Day3.validation.Utils.getValidateChoice;
import static Day3.validation.Utils.getValidatedReRun;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String start = "y";

        Library library = new Library();
        library.initBooks();

        while (start.equalsIgnoreCase("y")) {

            menuDisplay();

            int choice = getValidateChoice(input, "");

            Feature feature = FeatureFactory.getFeature(choice);
            if (feature != null) {
                feature.execute(input, library);
            } else {
                System.out.println("Invalid choice.");
            }


            start = getValidatedReRun(input, "Do you wish to continue? (y/n): ");
            System.out.println();
        }

        System.out.println("Thank you for using the Application!");
        input.close();
    }
}