public class Product {
    private String product;
    private boolean hasCredit;
    private double price;

    public Product() {

    }

    public Product(String product, double price) {
        setProduct(product);
        setPrice(price);
    }

    public Product(String product, boolean hasCredit) {
        setProduct(product);
        setHasCredit(hasCredit);
    }

    public boolean hasCredit() {
        return hasCredit;
    }

    public void setHasCredit(Boolean hasCredit) {
        this.hasCredit = hasCredit;
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
