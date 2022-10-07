import java.util.Arrays;
import java.util.Scanner;

public class Appointments {
    Scanner in = new Scanner(System.in);
    private int date;
    private String name;
    DateList dateList = new DateList();


    public Date showAvailableTimes(String input) {
        dateList.setDate(input);
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

    public void changeAppointment(int time, String name, String input) {
        dateList.setDate(input); //TODO add scanner to this
        Date date1;
        date1 = DateList.dates.get(date);
        date1.appointments.set(time - 10, new TimeSlot(name));
    }

    public void deleteAppointment(int time, String input) {
        dateList.setDate(input);
        Date date1;

        date1 = DateList.dates.set(date, DateList.dates.get(date));
        date1.appointments.set(time - 10, new TimeSlot("Ledig tid"));
    }


    public String getName() {
        return name;
    }

    public int getDate(){
        return date;
    }

    public void bookAppointment() {
        String date = dateList.inputDate();
        System.out.println(showAvailableTimes(date));
        System.out.print("What time do you want to book: ");
        int time = in.nextInt();
        in.nextLine();
        Date date1 = DateList.dates.get(getDate());
        if(!date1.appointments.get(time -10).getCustomerName().equals("Ledig tid")){
            System.out.println("Unable to book this time");
        } else {
            name = dateList.inputName();
            changeAppointment(time, name, date);
            System.out.println("The time has been booked");
        }
    }

    public void changeAppointment() {
        String date = dateList.inputDate();
        System.out.println(showAvailableTimes(date));
        System.out.print("What time do you want to change: ");
        int time = in.nextInt();
        in.nextLine();
        String name = dateList.inputName();
        changeAppointment(time, name,date);
        System.out.println("The time has been changed");
    }

    public void deleteAppointment(){
        String date = dateList.inputDate();
        System.out.println(showAvailableTimes(date));
        System.out.println("What time do you want to delete: ");
        int time = in.nextInt();
        deleteAppointment(time,date);
        System.out.println("The time has been deleted");
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "dateList=" + dateList +
                '}';
    }
}
