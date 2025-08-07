package Day3.menuAndChoices;

import Day3.features.*;

public class FeatureFactory {
    public static Feature getFeature(int choice) {
        return switch (choice) {
            case 1 -> new AddUser();
             case 2 -> new ViewBooks();
            // case 3 -> new IssueBook();
            // case 4 -> new ReturnBook();
            default -> null;
        };
    }
}