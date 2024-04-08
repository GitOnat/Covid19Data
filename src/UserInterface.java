import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    FileHandler fh = new FileHandler();
    public void startProgram() throws IOException {

        Scanner input = new Scanner(System.in);
        fh.loadAllData();

        int SENTINEL = 4;
        int userInput = -1;

        try {
            while (userInput != SENTINEL) {
                menu();
                userInput = input.nextInt();

                switch (userInput) {
                    case 1: {
                        displayData();
                        break;
                    }
                    case 2: {
                        displayDataRegionSorted();
                        break;
                    }
                    case 3: {
                        displayDataAldersgruppeSorted();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error. " + e.getMessage());
        }
    }

    public void menu() {
        System.out.println("Type 1 to display data unsorted.");
        System.out.println("Type 2 to display data sorted after region.");
        System.out.println("Type 3 to display data sorted after aldersgruppe.");
    }

            public void displayData(){
                for (Covid19Data covid : fh.getCovid19Array()) {
                    System.out.println(covid);
                }
            }

            public void displayDataRegionSorted(){
                fh.getCovid19Array().sort(new RegionComparator());
                for (Covid19Data covid : fh.getCovid19Array()) {
                    System.out.println(covid);
                }
            }

            public void displayDataAldersgruppeSorted(){
                fh.getCovid19Array().sort(new AldersgruppeComparator());
                for (Covid19Data covid : fh.getCovid19Array()) {
                    System.out.println(covid);
                }
            }
        }
