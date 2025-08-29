package Hello.Assingment2.src;

public class Product {
    int productId;
    String productName;
    int price;
    int quantity;

    Product(int productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    int getproductId() {
        return this.productId;
    }
    int eachBill(){
        return this.price * this.quantity;
    }
    int getQuantity(){
        return this.quantity;
    }
    String getDetails(){
        return "Product ID:- "+ this.productId+" Name:- "+ this.productName+" Price:- "+ this.price+" Quantity:- "+ this.quantity;
    }
}
