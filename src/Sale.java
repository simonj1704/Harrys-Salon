public class Sale {

    private double haircutPrice =  200;
    private int numberOfProducts = 0;
    private double productPrice;
    ProductList products = new ProductList();
    //Customer customer = new Customer();

    public void addProduct(){
        Product product;
        String productName;

        product = products.productList.get(1);
        productPrice = product.getPrice();

        productName = product.getProduct();
    }

    public void checkCredit(){


        
    }

    
    public void checkSale(){


    }
    public void addSale(){

        addProduct();
        double totalPrice = haircutPrice + productPrice;

    }
}
