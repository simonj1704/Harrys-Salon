import java.util.Scanner;

public class Sale {

    Scanner in = new Scanner(System.in);
    private boolean hasCredit = false;
    private double haircutPrice =  200;
    private int numberOfProducts = 0;
    private int date;
    private double totalPrice;
    private String product;
    private String productName;
    boolean askAgain = true;
    ProductList products = new ProductList();
    DateList dateList = new DateList();

    public Sale(double price, String product){
        totalPrice = price;
        this.product = product;
    }

    public Product addProduct(){
        Product product;

        System.out.println(products);
        System.out.println("Which item do you want to add?");
        int productChoice = in.nextInt();
        in.nextLine();

        product = products.getProductList().get(productChoice);
        return product;
    }

    public boolean checkCredit(){
        return checkCredit();
    }
    
    public void checkSale(){

    }

    public void addSale(String inputDate, int time) {
        Sale sale = new Sale(totalPrice, productName);
        Date date1;
        Product product;
        double productPrice = 0;
        String productName;
        String addSale;

        System.out.println("Do you want to add a product? yes/no");
        addSale = in.nextLine();

        if (addSale.equals("yes")) {
            product = addProduct();
            productPrice = product.getPrice();
            productName = product.getProduct();
        }

        dateList.date.timeSlot.sales.add(time, sale);
        date = dateList.checkDate(inputDate);
        date1 = dateList.dates.set(date, dateList.dates.get(date));
        totalPrice = haircutPrice + productPrice;
    }
}
