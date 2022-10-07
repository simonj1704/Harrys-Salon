import java.util.Arrays;
import java.util.Scanner;

public class Appointments {
    static Scanner in = new Scanner(System.in);
    private static int date;
    private static String name;
    static DateList dateList = new DateList();

    public Appointments() {
        DateList dateList1 = new DateList();
    }

    public static Date showAvailableTimes(String input) {
        setDate(input);
        Date date1;
        date1 = DateList.dates.get(date);
        return date1;
    }

    public Date[] showNextFourDays() {
        Date[] date1 = new Date[4];
        date1[0] = DateList.dates.get(date + 1);
        date1[1] = DateList.dates.get(date + 2);
        date1[2] = DateList.dates.get(date + 3);
        date1[3] = DateList.dates.get(date + 4);
        return date1;
    }

    public static void changeAppointment(int time, String name, String input) {
        setDate(input); //TODO add scanner to this
        Date date1;
        date1 = DateList.dates.get(date);
        date1.appointments.set(time - 10, new TimeSlot(name));
    }

    public static void deleteAppointment(int time, String input) {
        setDate(input);
        Date date1;

        date1 = DateList.dates.set(date, DateList.dates.get(date));
        date1.appointments.set(time - 10, new TimeSlot("Ledig tid"));
    }


    public static void setDate(String input) {
        date = dateList.checkDate(input);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Appointments.name = name;
    }

    public static int getDate(){
        return date;
    }
    @Override
    public String toString() {
        return "Appointments{" +
                "dateList=" + dateList +
                '}';
    }

    public static void bookAppointment() {
        String date = inputDate();
        System.out.println(showAvailableTimes(date));
        System.out.print("What time do you want to book: ");
        int time = in.nextInt();
        in.nextLine();
        Date date1 = DateList.dates.get(getDate());
        if(!date1.appointments.get(time -10).getCustomerName().equals("Ledig tid")){
            System.out.println("Unable to book this time");
        } else {
            name = inputName();
            changeAppointment(time, name, date);
            System.out.println("The time has been booked");
        }
    }

    public static void changeAppointment() {
        String date = inputDate();
        System.out.println(showAvailableTimes(date));
        System.out.print("What time do you want to change: ");
        int time = in.nextInt();
        in.nextLine();
        String name = inputName();
        changeAppointment(time, name,date);
        System.out.println("The time has been changed");
    }

    public static void deleteAppointment(){
        String date = inputDate();
        System.out.println(showAvailableTimes(date));
        System.out.println("What time do you want to delete: ");
        int time = in.nextInt();
        deleteAppointment(time,date);
        System.out.println("The time has been deleted");
    }

    private static String inputDate(){
        boolean keepRunning = false;
        System.out.print("Type the date to check D/M/Y: ");
        String date = in.nextLine();
        return date;
    }

    public static String inputName(){
        System.out.print("What is the name of the Customer: ");
        name = in.nextLine();
        return name;
    }

}
