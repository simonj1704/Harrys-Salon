import java.util.ArrayList;

public class DateList {
    public ArrayList<Date> dates = new ArrayList<Date>();
    public Date date = new Date();

    public DateList(){
        addDate();
    }

    public void addDate(){
        dates.add(new Date());
    }

    public void changeAppointment(String name, int time){
        date.appointments.set(time-1, new TimeSlot(name));
    }

    public static void main(String[] args) {
        DateList dateList = new DateList();
        dateList.addDate();
        dateList.changeAppointment("Harry", 1);
        System.out.println(dateList.date);
        System.out.println(dateList.dates);
    }
}
