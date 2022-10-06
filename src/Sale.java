import java.util.Scanner;

public class Sale {

    Scanner in = new Scanner(System.in);
    private double haircutPrice =  200;
    private int numberOfProducts = 0;
    private double productPrice;
    private int date;
    private double totalPrice;
    private String product;
    private String productName;
    boolean askAgain = true;
    ProductList products = new ProductList();
    Customer customer = new Customer();
    DateList dateList = new DateList();

    public Sale(double price, String product){
        totalPrice = price;
        this.product = product;
    }

    public void addProduct(){
        Product product;
        product = products.productList.get(1);
        productPrice = product.getPrice();
        productName = product.getProduct();

        System.out.println(products);
        System.out.println("Which item do you want to add?");
    }

    public boolean checkCredit(){

        return customer.hasCredit();

    }

    
    public void checkSale(){

    }
    public void addSale(String inputDate, int time) {
        String addSale = in.nextLine();

        totalPrice = haircutPrice + productPrice;
        Sale sale = new Sale(totalPrice, productName);
        dateList.date.timeSlot.sales.add(time, sale);
        date = dateList.checkDate(inputDate);
        Date date1;
        date1 = dateList.dates.set(date, dateList.dates.get(date));


        System.out.println("Do you want to add a product? yes/no");

        if (addSale.equals("yes")) {
            addProduct();
            date1.timeSlot.sales.add(time, sale);
        } else if (addSale.equals("no"))
            date1.timeSlot.sales.add(time, sale);
        else
            System.out.println("Type yes or no");
    }
}
