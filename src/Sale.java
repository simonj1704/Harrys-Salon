public class Sale {
    private double haircutPrice =  200;
    private int numberOfProducts = 0;
    private double productPrice;
    private int date;
    private double totalPrice;
    private String product;
    private String productName;
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
    }

    public boolean checkCredit(){

        return customer.hasCredit();

    }

    
    public void checkSale(){


    }
    public void addSale(String input){

        date = dateList.checkDate(input);
        addProduct();
        totalPrice = haircutPrice + productPrice;
        Sale sale = new Sale(totalPrice, productName);
        dateList.date.timeSlot.sales.add(date, sale);

    }
}
