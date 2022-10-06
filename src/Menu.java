import java.util.Scanner;

public class Menu {

    Scanner in = new Scanner(System.in);

    private String menuHeader;
    private String leadText;
    private String[] menuItems;
    int inputNumber;
    boolean keepRunning = true;

    public Menu() {
    }


    void printMenu() {
        System.out.println("Welcome to Harry's Salon. What would you like to do?");
        System.out.println("1. Book appointment");
        System.out.println("2. Change appointment");
        System.out.println("3. Delete appointment");
        System.out.println("4. Make sale");
        System.out.println("5. Check finances (REQUIRES PASSWORD!)");

    }

    int readInput() {
        do {
            System.out.println("Enter a command.");
            if (in.hasNextInt()) {
                inputNumber = in.nextInt();
                keepRunning = false;
            } else in.nextLine();
        } while (keepRunning);
        return inputNumber;

    }

    void menu() {
        boolean inputIsInt;
        printMenu();
        do {
            switch (readInput()) {
                case 1 -> {
                    System.out.println("You've chosen to book an appointment.");
                    inputIsInt = true;
                }
                case 2 -> {
                    System.out.println("You've chosen to change an appointment.");
                    inputIsInt = true;
                }
                case 3 -> {
                    System.out.println("You've chosen to delete an appointment.");
                    inputIsInt = true;
                }
                case 4 -> {
                    System.out.println("You've chosen to make a sale.");
                    inputIsInt = true;
                }
                case 5 -> {
                    System.out.println("You've chosen to check the finances.");
                    inputIsInt = true;
                }
                default -> {
                    System.out.println("Please enter a valid number.");
                    inputIsInt = false;
                }
            }
        } while (!inputIsInt);
    }
}
