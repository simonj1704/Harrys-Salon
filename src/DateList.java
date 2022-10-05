import java.util.ArrayList;

public class DateList {
    public ArrayList<Date> dates = new ArrayList<Date>();
    public Date date = new Date();

    public DateList(){
        addDate();
    }

    public void addDate(){
        dates.add(new Date());
    }

    @Override
    public String toString() {
        return "DateList{" +
                "dates=" + dates +
                '}';
    }
}
