public class Appointments {
    private int date;
    private String name;
    DateList dateList = new DateList();

    //TODO how to make the system work.
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
        appointments.changeAppointment(2, "Bob", "20/02/22");
        appointments.changeAppointment(1, "Harry", "20/03/22");
        System.out.println(appointments);
    }
}
