import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        try {
            ui.startProgram();
        } catch (Exception e) {
            System.out.println("Error. " + e.getMessage());
        }

    }
}