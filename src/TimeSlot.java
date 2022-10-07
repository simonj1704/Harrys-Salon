import java.util.ArrayList;

public class TimeSlot {
    private boolean hasCredit = false;
    private String customerName;

    private double totalPrice;
    public ArrayList<String> productNames = new ArrayList<>();

    public TimeSlot() {
        customerName = "Ledig tid";
    }

    public TimeSlot(String name) {
        setCustomerName(name);
    }

    public TimeSlot(double totalPrice, ArrayList<String> productNames, String customerName){
        setTotalPrice(totalPrice);
        setProductNames(productNames);
        setCustomerName(customerName);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean checkCredit() {

        return checkCredit();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(ArrayList<String> productNames) {
        this.productNames = productNames;
    }

    public String printSales(){
        String output;
        String name;
        if (getCustomerName().equals("Ledig tid")) {
            name = ConsoleColors.GREEN_BRIGHT + customerName + ConsoleColors.RESET;
        } else {
            name = ConsoleColors.RED_BRIGHT + ConsoleColors.RED_BOLD + customerName + ConsoleColors.RESET;
        }
        output = name + "\tSale totalprice: " + ConsoleColors.YELLOW_BRIGHT + totalPrice + ConsoleColors.RESET
                + " Products: " +  productNames.toString();
        return output;
    }
    @Override
    public String toString() {
        String output;
        if (customerName.equals("Ledig tid")) {
            output = ConsoleColors.GREEN_BRIGHT + customerName + ConsoleColors.RESET;
        } else {
            output = ConsoleColors.RED_BRIGHT + ConsoleColors.RED_BOLD + customerName + ConsoleColors.RESET;
        }
        return output;
    }
}
