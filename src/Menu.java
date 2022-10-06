import java.util.Scanner;

public class Menu {

    Scanner in = new Scanner(System.in);
    Appointments appointments = new Appointments();
    Vacation vacation = new Vacation();
    private String menuHeader;
    private String leadText;
    private String[] menuItems;
    int inputNumber;
    boolean keepRunning = true;
    boolean quitSystem = false;

    public Menu() {
    }


    void printMenu() {
        System.out.println("Welcome to Harry's Salon. What would you like to do?");
        System.out.println("1. Book appointment");
        System.out.println("2. Change appointment");
        System.out.println("3. Delete appointment");
        System.out.println("4. Make sale");
        System.out.println("5. Check finances (REQUIRES PASSWORD!)");
        System.out.println("6. Vacation MENU");
        System.out.println("9. QUIT SYSTEM");

    }

    int readInput() {
        do {
            System.out.println("Enter a command.");
            if (in.hasNextInt()) {
                inputNumber = in.nextInt();
                in.nextLine();
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
                    bookAppointment();
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
                case 6 -> {
                    System.out.println("You've chosen the vacation menu.");
                    inputIsInt = true;
                    vacationMenu();
                }
                case 9 -> {
                    System.out.println("You've chosen to quit system.");
                    inputIsInt = true;
                    quitSystem = true;
                }
                default -> {
                    System.out.println("Please enter a valid number.");
                    inputIsInt = false;
                }
            }
        } while (!inputIsInt);
    }

    private void bookAppointment() {
        System.out.print("Type the date to check: ");
        String date = in.nextLine();
        System.out.println(appointments.showAvailableTimes(date));
        System.out.println("What time do you want to book: ");
        int time = in.nextInt();
        in.nextLine();
        System.out.println("What is the name of the Customer: ");
        String name = in.nextLine();
        appointments.changeAppointment(time, name,date);
        System.out.println("The time has been booked");
    }
    private void vacationMenu() {
        System.out.println("Vacation Menu:");
        System.out.println("1. Book Vacation.");
        System.out.println("2. Delete Vacation.");
        int input = in.nextInt();
        in.nextLine();

        switch (input) {
            case 1 -> {
                System.out.println("You've chosen to Book Vacation.");
                System.out.println("Enter requested vacation date. 'DD/MM/YY'");
                String requestedDate = in.nextLine();
                boolean possible = vacation.checkVacationDate(requestedDate);
                if (possible) {
                    vacation.bookVacation(requestedDate);
                } else {
                    System.out.println("Date not available, booked timeslots.");
                }
            }
            case 2 -> {
                System.out.println("You've chosen to Delete Vacation");
                System.out.println("Enter vacation date you want deleted. 'DD/MM/YY'");
                String requestedDate = in.nextLine();
            }
        }

    }

    //TODO make method for checking invalid date
}
