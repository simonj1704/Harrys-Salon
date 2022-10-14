import java.util.Arrays;
import java.util.Scanner;

public class Appointments {
    private int date;
    private String name;
    final DateList dateList = new DateList();

    public Appointments() {
        DateList dateList1 = new DateList();
    }

    public Date showAvailableTimes(String input) {
        setDate(input);
        Date date1;
        date1 = DateList.dates.get(date);
        return date1;
    }

    public void showNextFourDays(String input) {
        setDate(input);
        System.out.println(DateList.dates.get(date + 1));
        System.out.println();
        System.out.println(DateList.dates.get(date + 2));
        System.out.println();
        System.out.println(DateList.dates.get(date + 3));
        System.out.println();
        System.out.println(DateList.dates.get(date + 4));
    }

    public void changeAppointment(int time, String name, String input) {
        setDate(input);
        Date date1;
        date1 = DateList.dates.get(date);
        date1.appointments.set(time - 10, new TimeSlot(name));
    }

    public void deleteAppointment(int time, String input) {
        setDate(input);
        Date date1;

        date1 = DateList.dates.set(date, DateList.dates.get(date));
        date1.appointments.set(time - 10, new TimeSlot("Ledig tid"));
    }


    public void setDate(String input) {
        date = dateList.checkDate(input);
    }

    public String getName() {
        return name;
    }


    public int getDate(){
        return date;
    }
    @Override
    public String toString() {
        return "Appointments{" +
                "dateList=" + dateList +
                '}';
    }

}
