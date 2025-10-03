package assignment2;
import java.util.Arrays;
import java.util.Scanner;

class InCartItem {
    static void main(){
        Scanner scan = new Scanner(System.in);
        CartItem[] item;
        ShoppingCart cart = new ShoppingCart();
        item = cart.intializeObjects();
        System.out.println("Welcome to Shopping Cart");
        int cartLength = 5;
        UserCart[] user = new UserCart[cartLength];
        //UserCart is being initialized
        for(int i=0;i< user.length;i++){
            user[i] = new UserCart();
        }
        int userCartIndex = 0;
        while(true){
            System.out.print("Want to try out some methods yes/no ");
            String choice = scan.next();
            if(choice.equals("no")){
                break;
            }
            System.out.print("'a' - add 'r' - remove 'd' - diplay products 'c' - cart 'pay' - Total Payment 'di' discount available: ");
            String switchChoice = scan.next();
            switch (switchChoice){
                case "a": System.out.print("Enter the item id to add ");
                //checkwhile
                int newItemId = scan.nextInt();
                if(item[newItemId-1].quantity > 0 && userCartIndex < user.length){
                    System.out.println(item[newItemId-1].itemName+" added to cart");
                    user[userCartIndex].userItemId = userCartIndex+1;
                    user[userCartIndex].userItemName =  item[newItemId-1].itemName;
                    user[userCartIndex].userPrice =  item[newItemId-1].price;
                    user[userCartIndex].userQuantity++;
                    item[newItemId-1].quantity--;
                    userCartIndex++;
                }
                else{
                    System.out.println("Check quantity of available products, or max limit of cart reached");
                }
                break;
                case "r": System.out.print("Enter the item id ");
                //check while
                int newItemID = scan.nextInt();
                if(userCartIndex >= 0){
                    int id = getCartItemId(user[newItemID-1].userItemName);
                    item[id-1].quantity++;
                    user[newItemID-1].userItemId = 2147483647;
                    user[newItemID-1].userItemName =  "Empty";
                    user[newItemID-1].userPrice =  0;
                    user[newItemID-1].userQuantity = 0;
                    userCartIndex--;
                    
                    for(int i=0;i<user.length;i++) {
                    	if(user[i].userItemId==0) {
                    		user[i].userItemId = 2147483647;
                    	}
                    	
                    }
                    //getUserArray(user);
                    for(int i=0;i<user.length;i++) {
                    	for(int j=i+1;j<user.length;j++) {
                    		if(user[i].userItemId>=user[j].userItemId) {
                    			UserCart c = user[j];
                    			user[j] = user[i];
                    			user[i] = c;
                    			
                    		}
                    	}
                    }
                    //getUserArray(user);
                    int indexing = 1;
                    for(int i=0;i<user.length;i++) {
                    	if(user[i].userItemId!=2147483647) {
                    		user[i].userItemId = indexing;
                    		indexing++;
                    	}
                    }
                    for(int i=0;i<user.length;i++) {
                    	if(user[i].userItemId==2147483647) {
                    		user[i].userItemId = 0;
                    	}
                    	
                    }
                    //getUserArray(user);
                }
                else{
                    System.out.println("You have remoed all the products, or the Id is not matching");
                }
                break;
                case "d": System.out.println("Displaying product ");
                for(int i=0;i<item.length;i++){
                    System.out.println(""+item[i].itemId+" "+item[i].itemName+" Price "+item[i].price+" Quantity "+item[i].quantity);
                }
                break;
                case "c": System.out.println("Here is your cart ");
                for(int i=0;i<user.length;i++){
                    if(!user[i].userItemName.equals("Empty")){
                        System.out.println(" "+user[i].userItemId+" "+user[i].userItemName+" Price "+user[i].userPrice+" Quantity "+user[i].userQuantity);
                    }
                }
                break;
                case "di": System.out.print("Discount Available: ");
                if(userCartIndex>=cartLength) {
                	System.out.println("20% Discount");
     
                }
                else {
                	System.out.println("Fill the cart to get 20%");
     
                }
                break;
                case "pay": System.out.print("Pay out is ");
            	float totalPayment = 0f;
                if(userCartIndex>=cartLength) {
                	for(int i=0;i<user.length;i++) {
                		totalPayment+=user[i].userPrice * user[i].userQuantity;
                	}
                	System.out.println("Total Payment "+ (totalPayment - 0.2*totalPayment));
                }
                else {
                	System.out.print("Fill the cart to get 20%");
                	System.out.println(": Total Payment "+totalPayment);
                }
                break;
                default:System.out.println("Invalid input");
            }
        }
    }
    static void getUserArray(UserCart[] user) {
    	for(int i=0;i<user.length;i++) {
    		System.out.println(user[i].userItemId+" "+user[i].userItemName+" "+user[i].userPrice+" "+user[i].userQuantity);
    	}
    }
    static int getCartItemId(String name){
        CartItem[] getItemID;
        ShoppingCart cart = new ShoppingCart();
        getItemID = cart.intializeObjects();
        int id = 0;
        for(int i=0;i<getItemID.length;i++){
            if(getItemID[i].itemName.equals(name)){
                id = getItemID[i].itemId;
            }
        }
        return id;
    }
}
