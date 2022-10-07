
public class Vacation {
    DateList dateList = new DateList();

    public void bookVacation(String input){
        Date date1;
        int numb = dateList.checkDate(input);
        date1 = DateList.dates.get(numb);
        for (int i = 0; i < 8; i++) {
            date1.appointments.set(i, new TimeSlot("FERIE"));
        }
        System.out.println(DateList.dates.get(numb));
    }

    public void deleteVacation(String input){
        Date date1;
        int numb = dateList.checkDate(input);
        date1 = DateList.dates.get(numb);
        for (int i = 0; i < 8; i++) {
            date1.appointments.set(i, new TimeSlot("Ledig tid"));
        }
        System.out.println(DateList.dates.get(numb));

    }

    public boolean checkVacationPlaced(String requestedDate) {
        boolean available = true;
        int checkDate = dateList.checkDate(requestedDate);
        Date date1 ;

        for (int i = 0; i < 8; i++) {
            date1 = DateList.dates.get(checkDate);
            if (!date1.appointments.get(i).getCustomerName().equals("FERIE")) {
                available = false;
                break;
            }
        }
        return available;
    }

    public boolean checkVacationDate(String requestedDate) {
        boolean available = true;
        int checkDate = dateList.checkDate(requestedDate);
        Date date1 ;

        for (int i = 0; i < 8; i++) {
            date1 = DateList.dates.get(checkDate);
            if (!date1.appointments.get(i).getCustomerName().equals("Ledig tid")) {
                available = false;
                break;
            }
        }
        return available;
    }
}
