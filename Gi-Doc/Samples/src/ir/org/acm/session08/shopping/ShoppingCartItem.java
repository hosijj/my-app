package ir.org.acm.session08.shopping;

public class ShoppingCartItem { // Product

    private String name;
    private double price;
    private int quantity;

    public ShoppingCartItem(){
    }

    public ShoppingCartItem(String itemName, double itemPrice, int itemQuantity){
        name = itemName;
        price = itemPrice;
        quantity = itemQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
