package david.geraldo.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Motor", 10000);

        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product.toString());

        Product product2 = new Product("Motor", 10000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
