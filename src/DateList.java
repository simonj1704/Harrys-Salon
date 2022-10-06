import java.util.ArrayList;

public class DateList {
    public ArrayList<Date> dates = new ArrayList<Date>();
    public Date date = new Date();
    private int date1;

    public DateList(){
       addAllDates();
    }

    public void addDate(){
        dates.add(new Date());
    }

    public void addAllDates(){
        for (int i = 0; i < 2000; i++) {
            dates.add(new Date());
        }
    }

    public int checkDate(String requestedDate) {
        int yearTwoThousand = 7306;
        int normalYearLength = 365;
        int leapYearLength = 366;


        String[] vacationDate = requestedDate.split("/");
        int year = Integer.parseInt(vacationDate[2]);
        int month = Integer.parseInt(vacationDate[1]);
        int date1 = Integer.parseInt(vacationDate[0]);
        int year1;

        if (year % 4 == 0) {
            year1 = (year * leapYearLength) - yearTwoThousand;
        } else {
            year1 = (year * normalYearLength) - yearTwoThousand;
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                month *= 31;
                break;
            case 2:
                if (year % 4 == 0)
                    month *= 29;
                else
                    month *= 28;
                break;
            case 4, 6, 9, 11:
                month *= 30;
                break;
        }
        this.date1 = year1 + month + date1;
        System.out.println(this.date1);

        return this.date1;
    }

    @Override
    public String toString() {
        return "DateList{" +
                "dates=" + dates +
                '}';
    }
}
