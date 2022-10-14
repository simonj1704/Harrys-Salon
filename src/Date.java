import java.util.ArrayList;

public class Date {
    public TimeSlot timeSlot = new TimeSlot();
    public ArrayList<TimeSlot> appointments = new ArrayList<TimeSlot>();

    public Date() {
        for (int i = 1; i <= 8; i++) {
            appointments.add(timeSlot);
        }
    }

    public String times() {
        return "10:00: " + appointments.get(0) + "\t 11:00: " + appointments.get(1) +
                "\t 12:00: " + appointments.get(2) + "\n13:00: " + appointments.get(3) + "\t 14:00: " + appointments.get(4)
                + "\t 15:00: " + appointments.get(5) + "\n16:00: " + appointments.get(6) + "\t 17:00: " + appointments.get(7);
    }

    public String timesWithProducts() {
        return "10:00: " + appointments.get(0).printSales() + "\n11:00: " + appointments.get(1).printSales() +
                "\n12:00: " + appointments.get(2).printSales() + "\n13:00: " + appointments.get(3).printSales() +
                "\n14:00: " + appointments.get(4).printSales() + "\n15:00: " + appointments.get(5).printSales() +
                "\n16:00: " + appointments.get(6).printSales() + "\n17:00: " + appointments.get(7).printSales();
    }


    @Override
    public String toString() {
        return times();
    }
}
