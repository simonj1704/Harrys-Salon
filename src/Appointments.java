public class Appointments {
    private int date;
    private String name;
    DateList dateList = new DateList();

    public Appointments(){

    }

    public void changeAppointment(int time, String name){
        Date date1;
        date1 = dateList.dates.set(date, dateList.dates.get(date));
        date1.appointments.set(time-1, new TimeSlot(name));
    }

    public void deleteAppointment(int time){
        Date date1;
        date1 = dateList.dates.set(date, dateList.dates.get(date));
        date1.appointments.set(time-1, new TimeSlot("Ledig tid"));
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
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
        appointments.changeAppointment(2, "Bob");
        appointments.changeAppointment(1, "Harry");
        System.out.println(appointments);
        appointments.deleteAppointment(2);
        appointments.changeAppointment(1,"Mikkel");
        System.out.println(appointments);
    }
}
