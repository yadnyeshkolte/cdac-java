package Hello.Assingment2.src;

import java.util.Scanner;

class InCartItem {
    static void main(){
        Scanner scan = new Scanner(System.in);
        CartItem[] item;
        ShoppingCart cart = new ShoppingCart();
        item = cart.intializeObjects();
        System.out.println("Welcome to Shopping Cart");
        UserCart[] user = new UserCart[5];
        //UserCart is being initialized
        for(int i=0;i< user.length;i++){
            user[i] = new UserCart();
        }
        int userCartIndex = 0;
        while(true){
            System.out.print("Want to try out some methods yes/no ");
            String choice = scan.nextLine();
            if(choice.equals("no")){
                break;
            }
            System.out.println(" ");
            System.out.print("'a' - add 'r' - remove 'd' - diplay products 'c' - cart 'di' discount available: ");
            switch (scan.nextLine()){
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
                    user[userCartIndex].userItemId = 0;
                    user[userCartIndex].userItemName =  "Empty";
                    user[userCartIndex].userPrice =  0;
                    user[userCartIndex].userQuantity = 0;

                    userCartIndex++;
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
                case "di": System.out.println("Discount Available ");
                break;
                default:System.out.println("Invalid input");
            }
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
