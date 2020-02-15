package ir.org.acm.session08.shopping;

import java.util.*;

public class ShoppingCart {

    private int itemCount;
    private double totalPrice;
    private ArrayList<ShoppingCartItem> items;
    private int customerId;

    public ShoppingCart(){
        items = new ArrayList();
    }

    public ShoppingCart(int customerId){
        this();
        this.customerId = customerId;
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
    }

    public void removeItem(ShoppingCartItem item) {
        items.remove(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public double getTotalPrice() {

        double totalPrice = 0;

        for (int i=0; i < items.size(); i++) {
            ShoppingCartItem p = items.get(i);
            totalPrice = totalPrice + p.getPrice();
        }
        return totalPrice;
    }

    public int getCustomerID() {
        return customerId;
    }

}
