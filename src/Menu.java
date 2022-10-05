import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner in = new Scanner(System.in);

    private String menuHeader;
    private String leadText;
    private String[] menuItems;

    int inputNumber;
    boolean keepRunning = true;



    public Menu(String menuHeader, String leadText, String[] menuItems) {
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }


    void printMenu() {
        System.out.println(menuHeader);
        System.out.println(leadText);
        //System.out.println(toString()); laver en tostring på menuItems, når  vi kender dem.

    }


    int readInput() {
        do {
            System.out.println("Indtast menupunkt");
            if (in.hasNextInt()) {
                inputNumber = in.nextInt();
                keepRunning = false;
            } else
                in.nextLine();
        } while (keepRunning);
        return inputNumber;

    }
}
