import java.util.Scanner;

public class Menu {

    Scanner in = new Scanner(System.in);
    Appointments appointments = new Appointments();
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
        boolean keepRunning = false;
        do {
            printMenu();
            switch (readInput()) {
                case 1 -> {
                    System.out.println("You've chosen to book an appointment.");
                    bookAppointment();
                }
                case 2 -> {
                    System.out.println("You've chosen to change an appointment.");
                }
                case 3 -> {
                    System.out.println("You've chosen to delete an appointment.");
                }
                case 4 -> {
                    System.out.println("You've chosen to make a sale.");
                }
                case 5 -> {
                    System.out.println("You've chosen to check the finances.");
                }
                case 9 -> {
                    System.out.println("You've chosen to quit system.");
                    keepRunning = true;
                }
                default -> {
                    System.out.println("Please enter a valid number.");
                }
            }
        } while (!keepRunning);
    }

    private void bookAppointment() {
        String date = inputDate();
        System.out.println(appointments.showAvailableTimes(date));
        System.out.println("What time do you want to book: ");
        int time = in.nextInt();
        in.nextLine();
        String name = inputName();
        appointments.changeAppointment(time, name,date);
        System.out.println("The time has been booked");
    }

    private String inputDate(){
        System.out.print("Type the date to check D/M/Y: ");
        String date = in.nextLine();
        return date;
    }

    private String inputName(){
        System.out.println("What is the name of the Customer: ");
        String name = in.nextLine();
        return name;
    }

    //TODO make method for checking invalid date
}
