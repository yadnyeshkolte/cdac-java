package Hello.Assingment2.src;

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
    int getItemId(){
        return this.itemId;
    }
    int getPrice(){
        return this.price;
    }
    int getQuantity(){
        return this.quantity;
    }
}
