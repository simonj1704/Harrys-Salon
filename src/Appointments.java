public class Appointments {
    private int date;
    private String name;
    DateList dateList = new DateList();

    public void addAppointment(String name, int time){
    }
    public void changeAppointment(String name, int time){
        //dateList.dates.set(date, dateList.date.appointments.set(time, new TimeSlot(name))));
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
}
