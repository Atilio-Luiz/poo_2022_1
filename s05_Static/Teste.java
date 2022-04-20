class Product {
    String name;
    double price;
    int quantity;
}

public class Teste {
    public static void main(String[] args) {
        Product p = new Product();
        Product q = null;
        System.out.println("name: " + p.name);
        System.out.println("price: " + p.price);
        System.out.println("quantity: " + p.quantity);
        System.out.println("product q: " + q);
    }
}