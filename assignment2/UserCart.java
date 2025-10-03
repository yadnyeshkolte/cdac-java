package assignment2;

public class UserCart {

    int userItemId;
    String userItemName;
    int userPrice;
    int userQuantity;

    UserCart(){
        userItemId = 0;
        userItemName = "Empty";
        userPrice = 0;
        userQuantity = 0;
    }
    UserCart(int userItemId, String userItemName, int userPrice, int userQuantity) {
        this.userItemId = userItemId;
        this.userItemName = userItemName;
        this.userPrice = userPrice;
        this.userQuantity = userQuantity;
    }
}
