package assignment3.ecommerce;
import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Electronics[] eProducts = new Electronics[5];
		Clothing[] cProducts = new Clothing[5];
		
		ElectronicsProduct e = new ElectronicsProduct();
		ClothingProduct c = new ClothingProduct();
		
		eProducts = e.getElectronics();
		cProducts = c.getClothing();
		int warranty;
		int percentage;
		for(int i=0;i<eProducts.length;i++) {
			System.out.print("Please Enter the "+eProducts[i].name+" Warranty ");
			warranty = scan.nextInt();
			eProducts[i].applyWarranty(warranty);
		}
		
		for(int i=0;i<eProducts.length;i++) {
			System.out.print(cProducts[i].name+": Please Enter the discount in percentage: ");
			percentage = scan.nextInt();
			System.out.println(cProducts[i].applyDiscount(percentage)+": Its original Price "+cProducts[i].price);
		}
	}
}
