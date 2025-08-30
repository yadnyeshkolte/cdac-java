
public class CartItem {
    int itemId;
    String itemName;
    int price;
    int quantity;

    CartItem(int itemId, String itemName, int price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    String getItemName(){
        return this.itemName;
    }

    int getPrice(){
        return this.price;
    }
    int getQuantity(){
        return this.quantity;
    }

}
