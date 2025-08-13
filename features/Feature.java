package features;

import java.util.Scanner;
import services.Library;

public interface Feature {
    void execute(Scanner input, Library library);
}