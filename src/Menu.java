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
        getMenuHeader();
        getLeadText();
        getMenuItems();
    }


    public String getMenuHeader(){
        System.out.println("velkommen");
        return menuHeader;
    }

    public void setMenuHeader(String menuHeader){
        this.menuHeader = menuHeader;
    }

    public String getLeadText(){
        return leadText;
    }

    public void setleadText(String leadText){
        this.leadText = leadText;
    }

    public String[] getMenuItems(){
        return menuItems;
    }

    public void setMenuItems(){
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

    void menu() {
        boolean inputIsInt;
        do {
            printMenu();
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
