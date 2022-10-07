import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private String name;
    Scanner in = new Scanner(System.in);
    Appointments appointments = new Appointments();
    Vacation vacation = new Vacation();
    Sale sale = new Sale();
    int inputNumber;
    boolean keepRunning = true;

    public Menu() {
    }


    void printMenu() {
        System.out.println("\nWelcome to Harry's Salon. What would you like to do?");
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
            System.out.println("Enter a command: ");
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
                    makeSale();
                }
                case 5 -> {
                    System.out.println("You've chosen to check the finances.");
                    boolean correctPassword = false;
                    String input;
                    do {
                        System.out.println("Enter password\nPress 9 for main menu");
                        input = in.nextLine();
                        if (input.equals("hairyharry")){
                            checkFinances();
                            correctPassword = false;
                        }else if (input.equals("9")) {
                            menu();
                        }else
                            System.out.println("Password incorrect. Try again.");
                        correctPassword = true;
                    }while (correctPassword);

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
        String date = readDateInput();
        System.out.println(appointments.showAvailableTimes(date));
        System.out.print("What time do you want to book: ");
        int time = in.nextInt();
        in.nextLine();
        Date date1 = DateList.dates.get(appointments.getDate());
        if(!date1.appointments.get(time -10).getCustomerName().equals("Ledig tid")){
            System.out.println("Unable to book this time");
        } else {
        name = inputName();
        appointments.changeAppointment(time, name, date);
        System.out.println("The time has been booked");
        }
    }

    private void changeAppointment() {
        String date = readDateInput();
        System.out.println(appointments.showAvailableTimes(date));
        System.out.print("What time do you want to change: ");
        int time = in.nextInt();
        in.nextLine();
        String name = inputName();
        appointments.changeAppointment(time, name,date);
        System.out.println("The time has been changed");
    }

    private void deleteAppointment(){
        String date = readDateInput();
        System.out.println(appointments.showAvailableTimes(date));
        System.out.println("What time do you want to delete: ");
        int time = in.nextInt();
        appointments.deleteAppointment(time,date);
        System.out.println("The time has been deleted");
    }

    public void makeSale(){
        String date = readDateInput();
        appointments.showAvailableTimes(date);
        System.out.println(appointments.showAvailableTimes(date));
        int time = inputTime();

        sale.addSale(date,time);
        System.out.println("The sale has been added");
    }

    public void checkFinances(){
        String date = readDateInput();
        System.out.println(sale.checkSale(date));
    }

    private int inputTime(){
        System.out.print("Type the timeslot: ");
        int time = in.nextInt();
        return time;

    }

    public String inputName(){
        System.out.print("What is the name of the Customer: ");
        name = in.nextLine();
        return name;
    }

    String readDateInput() {
        String requestedDate;
        boolean keepRunningDate = true;
        do {
            System.out.println("Enter requested date. 'DD/MM/YY'");
            requestedDate = in.nextLine();
            int year = 0;
            int month = 0;
            int day = 0;
            if (requestedDate.contains("/")) {
                String[] dateInput = requestedDate.split("/");
                if (dateInput[1].matches("^[0-9]+$")) {
                    month = Integer.parseInt(dateInput[1]);
                }
                if (dateInput[0].matches("^[0-9]+$")) {
                    day = Integer.parseInt(dateInput[0]);
                }
                if (dateInput[2].matches("^[0-9]+$")) {
                    year = Integer.parseInt(dateInput[2]);
                }
                if (year >= 20 && year <= 99) {
                    if (month > 0 && month <= 12)
                        if (day > 0 && day <= 31) {
                            keepRunningDate = false;
                        }
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
        int input = in.nextInt();
        in.nextLine();

        switch (input) {
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
