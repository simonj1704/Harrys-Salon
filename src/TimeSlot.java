import java.util.ArrayList;

public class TimeSlot {
    private String customerName;
    public ArrayList<Sale> sales = new ArrayList<>();
    public TimeSlot(){
        customerName = "Ledig tid";
    }

    public TimeSlot(String name){
        setCustomerName(name);
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return customerName;
    }
}
