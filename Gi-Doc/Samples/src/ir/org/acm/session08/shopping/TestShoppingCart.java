package ir.org.acm.session08.shopping;

public class TestShoppingCart {

    public static void main(String[] args) {

        ShoppingCartItem item1 = new ShoppingCartItem("Bag", 1000.5,1 );
        ShoppingCartItem item2 = new ShoppingCartItem("Book", 200.3, 2);
        ShoppingCartItem item3 = new ShoppingCartItem("Pen", 200, 7);

        //customerId:1
        ShoppingCart cart = new ShoppingCart(1);
        cart.addItem(item1);
        System.out.println("Number of items: " + cart.getItemCount() + ", totalPrice:" + cart.getTotalPrice() )  ;
        cart.addItem(item2);
        System.out.println("Number of items: " + cart.getItemCount() + ", totalPrice:" + cart.getTotalPrice() )  ;
        cart.removeItem(item2);
        System.out.println("Number of items: " + cart.getItemCount() + ", totalPrice:" + cart.getTotalPrice() )  ;
        cart.addItem(item3);
        System.out.println("Number of items: " + cart.getItemCount() + ", totalPrice:" + cart.getTotalPrice() )  ;

    }

}
