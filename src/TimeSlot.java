
public class TimeSlot {
    private String customerName;
    public Sale sale = new Sale();

    public TimeSlot(){
        customerName = "Ledig tid";
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "customerName='" + customerName + '\'' +
                '}';
    }
}
