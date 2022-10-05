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
}
