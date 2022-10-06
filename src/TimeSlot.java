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
        String output;
        if(customerName.equals("Ledig tid")){
            output = ConsoleColors.GREEN_BRIGHT + customerName + ConsoleColors.RESET;
        } else {
            output = ConsoleColors.RED_BRIGHT + ConsoleColors.RED_BOLD + customerName + ConsoleColors.RESET;
        }
        return output;
    }
}
