public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Invalid Price Initialization: Price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double pr) {
        if (pr > 0) {
            price = pr;
        } else {
            System.out.println("Price value cannot be negative");
        }
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Lamp", 5500.0);
        Product prod2 = new Product("Juice", 250.0);
        System.out.println("Product 1 has name: " + prod1.getName() + " and price: " + prod1.getPrice() + "Rs");
        System.out.println("Product 2 has name: " + prod2.getName() + " and price: " + prod2.getPrice() + "Rs");
        System.out.println("--------------------------------------------------------");
        prod1.setName("Spotlights");
        prod2.setName("Fresh Juice");
        prod1.setPrice(7800.0);
        prod2.setPrice(300.0);
        System.out.println("Updated Name and Price for product 1 = " + prod1.getName() + " - " + prod1.getPrice() + "Rs");
        System.out.println("Updated Name and Price for product 2 = " + prod2.getName() + " - " + prod2.getPrice() + "Rs");
    }
}
