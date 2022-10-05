import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner in = new Scanner(System.in);

    private String menuHeader;
    private String leadText;
    private String[] menuItems;

    int inputNumber;
    boolean keepRunning = true;

    public Menu (){
    }


    void printMenu() {
        System.out.println("Velkommen til Harrys Salon bookingapplikation");
        System.out.println("1. Book aftale");

    }

    int readInput() {
        do {
            System.out.println("Indtast menupunkt:");
            if (in.hasNextInt()) {
                inputNumber = in.nextInt();
                keepRunning = false;
            } else
                in.nextLine();
        } while (keepRunning);
        return inputNumber;

    }

    void menu() {
        boolean inputIsInt;
        printMenu();
        do {
            switch (readInput()) {
                case 1:
                    System.out.println("Du har valgt 1.");
                    inputIsInt = true;
                    break;
                default:
                    System.out.println("Indtast venligst et tal fra menupunktet.");
                    inputIsInt = false;
                    break;
            }
        } while (!inputIsInt);
    }
}
