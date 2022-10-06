import java.util.Arrays;

public class Appointments {
    private int date;
    private String name;
    DateList dateList = new DateList();
    //TODO where to make a filter
    //TODO how to make the system work.

    public Date showAvailableTimes(String input){
        setDate(input);
        Date date1;
        date1 = dateList.dates.get(date);
        return date1;
    }

    public Date[] showNextFourDays(){
        Date[] date1 = new Date[4];
        date1[0] = dateList.dates.get(date + 1);
        date1[1] = dateList.dates.get(date + 2);
        date1[2] = dateList.dates.get(date + 3);
        date1[3] = dateList.dates.get(date + 4);
        return date1;
    }

    public void changeAppointment(int time, String name, String input){
        setDate(input); //TODO add scanner to this
        Date date1;
        date1 = dateList.dates.set(date, dateList.dates.get(date));
        date1.appointments.set(time-1, new TimeSlot(name));
    }

    public void deleteAppointment(int time, String input){
        setDate(input);
        Date date1;
        date1 = dateList.dates.set(date, dateList.dates.get(date));
        date1.appointments.set(time-1, new TimeSlot("Ledig tid"));
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

    @Override
    public String toString() {
        return "Appointments{" +
                "dateList=" + dateList +
                '}';
    }

    public static void main(String[] args) {
        Appointments appointments = new Appointments();
        appointments.changeAppointment(2, "Bob", "22/02/22");
        appointments.changeAppointment(1, "Harry", "20/02/22");
        System.out.println(appointments.showAvailableTimes("20/02/22"));
        System.out.println(Arrays.toString(appointments.showNextFourDays()));
        System.out.println(appointments.dateList.date.times());
    }
}
