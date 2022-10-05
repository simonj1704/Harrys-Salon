public class Appointments {
    private int date;
    private String name;
    DateList dateList = new DateList();

    public Appointments(){

    }

    public void addAppointment(String name, int time){
    }
    public void changeAppointment(String name, int time){
        Date date1 = dateList.dates.set(date, dateList.dates.get(date));
        date1.appointments.set(time, new TimeSlot(name));
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

    public static void main(String[] args) {
        Appointments appointments = new Appointments();
        System.out.println(appointments);
    }
}
