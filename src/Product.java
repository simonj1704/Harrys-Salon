public class Product {
    private String product;
    private double price;

    public Product(String product, double price){
        setProduct(product);
        setPrice(price);
    }


    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produktliste" +
                "Produkt: " + product + '\'' +
                " Pris: " + price +
                '}';
    }
}
