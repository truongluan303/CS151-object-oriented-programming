/**
 * Product class
 * 
 * represents a real life product with characteristics such as
 * product's name, description, price, and maximum quanity to be ordered.
 */
public class Product {

    private String productName;
    private String productDescription;
    private float productPrice;
    private long maxQuantity;
    

    public Product(String name, String description, float price, long maxQuan) {
        this.productName = name;
        this.productDescription = description;
        this.productPrice = price;
        this.maxQuantity = maxQuan;
    }


    @Override
    public String toString() {
        return (
            "Name: " + productName + "\n" +
            "Description: " + productDescription + "\n" +
            "Price: $" + productPrice + "\n" +
            "Max Quantity: " + maxQuantity + " units\n"
        );
    }
}