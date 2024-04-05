import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        try {
            //load data
            ArrayList<Covid19Data> covidData = fh.loadAllData();

            // display data
            for (Covid19Data covid : covidData) {
                System.out.println(covid);
            }
        } catch (Exception e) {
            System.out.println("Error. " + e.getMessage());
        }

    }
}