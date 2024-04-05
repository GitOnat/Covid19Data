import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("Covid19Data.csv");

    public ArrayList<Covid19Data> loadAllData() throws IOException {
        ArrayList<Covid19Data> covid19Array = new ArrayList();
            Scanner sc = new Scanner(file, StandardCharsets.ISO_8859_1);
            sc.nextLine();  // Skip første linje

        Covid19Data covid = null;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");

            Covid19Data covidObj = new Covid19Data(attributes[0], attributes[1], Integer.parseInt(attributes[2]), Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]), Integer.parseInt(attributes[5]), attributes[6]);
            covid19Array.add(covidObj);
        }
        sc.close();
        return covid19Array;
    }
}