package assignment2;

import java.util.Scanner;

class InProduct {
    static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of products you want to add: ");
        int numberOfProducts =  Integer.parseInt(scan.nextLine());
        Product[] product = new Product[numberOfProducts];
        System.out.println("Please Enter the Product details");
        for(int i = 0; i < product.length; i++){
            System.out.println("Product " + (i+1) + ": ");
            System.out.print("Product Id: ");
            int productId = Integer.parseInt(scan.nextLine());
            System.out.print("Product Name: ");
            String productName = scan.nextLine();
            System.out.print("Product Price: ");
            int productPrice = Integer.parseInt(scan.nextLine());
            System.out.print("Product Quantity: ");
            int productQuantity = Integer.parseInt(scan.nextLine());

            product[i] = new Product(productId,productName,productPrice,productQuantity);
        }
        while(true){
            System.out.print("Want to try ot some Methods yes/no: ");
            String input = scan.nextLine();
            if(input.equals("yes")){
                System.out.print("'be' - Bill for each 'bt' - Bill total: 'dap' - Display ALl Products: ");
                switch(scan.nextLine()){
                    case "be": System.out.print("Enter Id of Product: ");
                    int  productIdNumber = Integer.parseInt(scan.nextLine());
                    for(int a = 0; a < product.length; a++){
                        if(product[a].getproductId()==productIdNumber){
                                System.out.println("Bill for each Laptop : "+product[a].eachBill());
                        }
                    }
                    break;
                    case "bt": int totalBillAmount = 0;
                    for(int a = 0; a < product.length; a++){
                        totalBillAmount += product[a].eachBill();
                    }
                    System.out.println("Total Bill Amount : "+totalBillAmount);
                    break;
                    case "dap": System.out.println("Here are the details");
                    for(int i=0;i<product.length;i++){
                        System.out.println(product[i].getDetails());
                    }
                    break;
                    default: System.out.println("Invalid Input");
                }
            }
            else if(input.equals("no")){
                break;
            }
        }
    }
}
