public class Vacation {
    private String vacationDay;

    public String getVacationDay() {
        return vacationDay;
    }

    public void setVacationDay(String vacationDay) {
        this.vacationDay = vacationDay;
    }

    public void checkDate(String vacationDay) {
        Date date = new Date();
        int yearTwoThousand = 7306;
        int normalYearLength = 365;
        int leapYearLength = 366;

        String[] vacationDate = vacationDay.split("/");
        int year = Integer.parseInt(vacationDate[2]);
        int month = Integer.parseInt(vacationDate[1]);
        int date1 = Integer.parseInt(vacationDate[0]);
        int socket1;

        if (year % 4 == 0) {
            socket1 = (year * leapYearLength) - yearTwoThousand;
        } else {
            socket1 = (year * normalYearLength) - yearTwoThousand;
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
        System.out.println(socket1 + month + date1);

    }
}