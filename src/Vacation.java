import java.sql.Time;

public class Vacation {
    DateList dateList = new DateList();
    private String vacationDay;

    public String getVacationDay() {
        return vacationDay;
    }

    public void setVacationDay(String vacationDay) {
        this.vacationDay = vacationDay;
    }

    public void bookVacation(String input){
        Date date1;
        int numb = dateList.checkDate(input);
        date1 = dateList.dates.get(numb);
        date1.appointments.set(0, new TimeSlot("FERIE"));
        System.out.println(dateList.dates.get(numb));
        for (int i = 0; i < 8; i++) {
            date1.appointments.set(i, new TimeSlot("FERIE"));
        }
    }
    public boolean checkVacationDate(String requestedDate) {
        int numb;
        boolean available = true;
        numb = dateList.checkDate(requestedDate);
        System.out.println(dateList.dates.get(numb));

        for (int i = 0; i < 8; i++) {
            TimeSlot timeSlot = dateList.date.appointments.get(i);
            if (!timeSlot.getCustomerName().equals("Ledig tid")) {
                available = false;
                break;
            }
        }
        return available;
    }
}
