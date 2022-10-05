import java.util.ArrayList;

public class Date {
    public TimeSlot timeSlot = new TimeSlot();
    public ArrayList<TimeSlot> appointments = new ArrayList<TimeSlot>();

    public Date(){
        for (int i = 1; i <= 8; i++) {
            appointments.add(timeSlot);
        }
    }

    public void changeAppointment(String name, int time){
    }

    @Override
    public String toString() {
        return "Date{" +
                "appointments=" + appointments +
                '}';
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
}
