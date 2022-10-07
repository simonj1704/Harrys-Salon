import java.util.ArrayList;
import java.util.Scanner;

public class DateList {
    Scanner in = new Scanner(System.in);
    public static ArrayList<Date> dates = new ArrayList<Date>();
    public Date date = new Date();
    private int date1;
    private String name;

    public DateList() {
        addAllDates();
    }

    public void addDate() {
        dates.add(new Date());
    }

    public void addAllDates() {
        for (int i = 0; i < 2000; i++) {
            dates.add(new Date());
        }
    }

    public Date showAvailableTimes(String input) {
        setDate(input);
        Date date1;
        date1 = DateList.dates.get(this.date1);
        return date1;
    }

    public void setDate(String input) {
        date1 = checkDate(input);
    }

    public int checkDate(String requestedDate) {
        String[] vacationDate = requestedDate.split("/");
        int yearTwoThousand = 8030;
        int normalYearLength = 365;
        int year = Integer.parseInt(vacationDate[2]) * normalYearLength - yearTwoThousand;
        int month = Integer.parseInt(vacationDate[1]);
        int date1 = Integer.parseInt(vacationDate[0]);

        switch (month) {
            case 1:
                month = 0;
                break;
            case 2:
                month = 31;
                break;
            case 3:
                month = 59;
                break;
            case 4:
                month = 90;
                break;
            case 5:
                month = 120;
                break;
            case 6:
                month = 151;
                break;
            case 7:
                month = 181;
                break;
            case 8:
                month = 212;
                break;
            case 9:
                month = 243;
                break;
            case 10:
                month = 273;
                break;
            case 11:
                month = 304;
                break;
            case 12:
                month = 334;
                break;
        }
        if (Integer.parseInt(vacationDate[2]) % 4 == 0)
            month += 1;

        this.date1 = year + month + date1;

        return this.date1;
    }

    String inputDate() {
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
                if (dateInput[0].matches("^[0-2]+$")) {
                    month = Integer.parseInt(dateInput[0]);
                }
                if (dateInput[1].matches("^[0-2]+$")) {
                    day = Integer.parseInt(dateInput[1]);
                }
                if (dateInput[2].matches("^[0-2]+$")) {
                    year = Integer.parseInt(dateInput[2]);
                }
                if ((year > 0 && year < 99) && (month > 0 && month < 12) && (day > 0 && day < 31)) {
                    keepRunningDate = false;
                }
            }
        } while (keepRunningDate);
        return requestedDate;
    }

    public String inputName() {
        System.out.print("What is the name of the Customer: ");
        name = in.nextLine();
        return name;
    }

    public int inputTime() {
        System.out.print("Type the timeslot: ");
        int time = in.nextInt();
        return time;
    }

    @Override
    public String toString() {
        return "DateList{" +
                "dates=" + dates +
                '}';
    }
}
