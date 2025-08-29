package Hello.Assingment2.src;

import java.util.Scanner;

class InCartItem {
    static void main(){
        Scanner scan = new Scanner(System.in);
        CartItem[] item = new CartItem[20];
        ShoppingCart cart = new ShoppingCart();
        item = cart.intializeObjects();
        System.out.println("Welcome to Shopping Cart");
        while(true){
            System.out.println("Want to try out some methods");
            System.out.print("'a' - add 'r' - remove 'd' - diplay products 'c' - cart 'di' discount available: ");
            switch (scan.nextLine()){
                case "a": System.out.println("Enter the item id ");

                break;
                case "r": System.out.println("Enter the item id ");
                break;
                case "d": System.out.println("Displaying product ");
                break;
                case "c": System.out.println("Here is your cart ");
                break;
                case "di": System.out.println("Discount Available ");
                break;
                default:System.out.println("Invalid input");
            }
        }
    }
}
