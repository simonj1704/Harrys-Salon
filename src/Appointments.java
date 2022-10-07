import java.util.Arrays;
import java.util.Scanner;

public class Appointments {
    Scanner in = new Scanner(System.in);
    private int date;
    private String name;
    DateList dateList = new DateList();

    public Appointments() {
        DateList dateList1 = new DateList();
    }

    public Date showAvailableTimes(String input) {
        setDate(input);
        Date date1;
        date1 = dateList.dates.get(date);
        return date1;
    }

    public Date[] showNextFourDays() {
        Date[] date1 = new Date[4];
        date1[0] = dateList.dates.get(date + 1);
        date1[1] = dateList.dates.get(date + 2);
        date1[2] = dateList.dates.get(date + 3);
        date1[3] = dateList.dates.get(date + 4);
        return date1;
    }

    public void changeAppointment(int time, String name, String input) {
        setDate(input);
        Date date1;
        date1 = dateList.dates.get(date);
        date1.appointments.set(time - 10, new TimeSlot(name));
    }

    public void deleteAppointment(int time, String input) {
        setDate(input);
        Date date1;

        date1 = dateList.dates.set(date, dateList.dates.get(date));
        date1.appointments.set(time - 10, new TimeSlot("Ledig tid"));
    }


    public void setDate(String input) {
        date = dateList.checkDate(input);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
