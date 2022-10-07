import java.util.ArrayList;

public class ProductList {
    public ArrayList<Product> productList = new ArrayList<Product>();


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

    @Override
    public String toString() {
        return "ProductList{" +
                "productList=" + productList +
                '}';
    }
}
