import java.util.ArrayList;

public class Date {
    public TimeSlot timeSlot = new TimeSlot();
    public ArrayList<TimeSlot> appointments = new ArrayList<TimeSlot>();

    public Date(){
        for (int i = 1; i <= 8; i++) {
            appointments.add(timeSlot);
        }
    }
    @Override
    public String toString() {
        return "Date{" +
                "appointments=" + appointments +
                '}';
    }
}
