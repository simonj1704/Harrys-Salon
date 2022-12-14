import java.util.ArrayList;

public class ProductList {
    public final ArrayList<Product> productList = new ArrayList<>();


    public ProductList() {
        generalProducts();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void generalProducts() {
        productList.add(new Product("Hårbørste", 249.95));
        productList.add(new Product("Shampoo", 149.95));
        productList.add(new Product("Hårvoks", 179.99));
        productList.add(new Product("Credit", true));
    }

    private String printOut(){
        String output;
        output = "Productlist:\nProduct 1: " + productList.get(0) + "\n" +
                "Product 2: " + productList.get(1) + "\n" +
                "Product 3: " + productList.get(2) + "\n" +
                "Product 4: " + productList.get(3) + "\n";
        return output;
    }
    @Override
    public String toString() {
        return printOut();
    }

}
