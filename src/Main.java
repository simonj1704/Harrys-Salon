public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Menu menu1 = new Menu();
        ProductList productList = new ProductList();
        System.out.println(productList.getProductList());
    }
}