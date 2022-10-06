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
                    changeAppointment();
                }
                case 3 -> {
                    System.out.println("You've chosen to delete an appointment.");
                    deleteAppointment();
                }
                case 4 -> {
                    System.out.println("You've chosen to make a sale.");
                }
                case 5 -> {
                    System.out.println("You've chosen to check the finances.");
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

    private void bookAppointment() {
        String date = inputDate();
        System.out.println(appointments.showAvailableTimes(date));
        System.out.print("What time do you want to book: ");
        int time = in.nextInt();
        in.nextLine();
        String name = inputName();
        appointments.changeAppointment(time, name,date);
        System.out.println("The time has been booked");
        //TODO make it so you cant change appointments
    }

    private void changeAppointment() {
        String date = inputDate();
        System.out.println(appointments.showAvailableTimes(date));
        System.out.print("What time do you want to change: ");
        int time = in.nextInt();
        in.nextLine();
        String name = inputName();
        appointments.changeAppointment(time, name,date);
        System.out.println("The time has been changed");
    }

    private void deleteAppointment(){
        String date = inputDate();
        System.out.println(appointments.showAvailableTimes(date));
        System.out.println("What time do you want to delete: ");
        int time = in.nextInt();
        appointments.deleteAppointment(time,date);
        System.out.println("The time has been deleted");
    }

    private String inputDate(){
        System.out.print("Type the date to check D/M/Y: ");
        String date = in.nextLine();
        return date;
    }

    private String inputName(){
        System.out.print("What is the name of the Customer: ");
        String name = in.nextLine();
        return name;
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
