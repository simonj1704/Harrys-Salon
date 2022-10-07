import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    Vacation vacation = new Vacation();
    int inputNumber;
    boolean keepRunning = true;

    public Menu() {
    }

    Appointments appointment = new Appointments();
    Sale sale = new Sale();

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
        boolean keepRunning = false;
        do {
            printMenu();
            switch (readInput()) {
                case 1 -> {
                    System.out.println("You've chosen to book an appointment.");
                    appointment.bookAppointment();
                }
                case 2 -> {
                    System.out.println("You've chosen to change an appointment.");
                    appointment.changeAppointment();
                }
                case 3 -> {
                    System.out.println("You've chosen to delete an appointment.");
                    appointment.deleteAppointment();
                }
                case 4 -> {
                    System.out.println("You've chosen to make a sale.");
                    sale.makeSale();
                }
                case 5 -> {
                    System.out.println("You've chosen to check the finances.");
                    sale.checkFinances();
                }
                case 6 -> {
                    System.out.println("You've chosen the vacation menu.");
                    vacationMenu();
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

    String readDateInput() {
        String requestedDate;
        boolean keepRunningDate = true;
        do {
            System.out.println("Enter requested vacation date. 'DD/MM/YY'");
            requestedDate = in.nextLine();
            int year = 0;
            int month = 0;
            int day = 0;
            if (requestedDate.contains("/")) {
                String[] dateInput = requestedDate.split("/");
                if (dateInput[0].matches("^[1-2]+$")) {
                    month = Integer.parseInt(dateInput[0]);
                }
                if (dateInput[1].matches("^[1-2]+$")) {
                    day = Integer.parseInt(dateInput[1]);
                }
                if (dateInput[2].matches("^[1-2]+$")) {
                    year = Integer.parseInt(dateInput[2]);
                }
                if ((year > 0 && year < 99) && (month > 0 && month < 12) && (day > 0 && day < 31)) {
                    keepRunningDate = false;
                }
            }
        } while (keepRunningDate);
        return requestedDate;
    }


    private void vacationMenu() {
        System.out.println("Vacation Menu:");
        System.out.println("1. Book Vacation.");
        System.out.println("2. Delete Vacation.");
        System.out.println("3. Return to Main Menu.");

        switch (readInput()) {
            case 1 -> {
                System.out.println("You've chosen to Book Vacation.");
                String requestedDate = readDateInput();
                boolean possible = vacation.checkVacationDate(requestedDate);
                if (possible) {
                    vacation.bookVacation(requestedDate);
                } else {
                    System.out.println("Date not available, booked timeslots.");
                }
            }
            case 2 -> {
                System.out.println("You've chosen to Delete Vacation");
                String requestedDate = readDateInput();
                boolean placedVacation = vacation.checkVacationPlaced(requestedDate);
                if (placedVacation) {
                    vacation.deleteVacation(requestedDate);
                    System.out.println("Vacation on the: " + requestedDate + " has been removed.");
                } else {
                    System.out.println("Failed. Date has not been chosen for vacation.");
                }

            }
        }

    }

    //TODO make method for checking invalid date
}
