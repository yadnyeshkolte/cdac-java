package questions.productmanagentsystemfilehandling;
import java.util.ArrayList;
public class ProductArray {
	static ArrayList<Product> getProducts(){
		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product(1,"basketball",420,8));
		al.add(new Product(2,"baseball",100,3));
		al.add(new Product(3,"tennisball",990,1));
		al.add(new Product(4,"bat",440,8));
		al.add(new Product(4,"net",430,2));
		al.add(new Product(5,"socks",56540,1));
		al.add(new Product(6,"carromboard",7760,3));
		al.add(new Product(7,"chess",90000,9));
		al.add(new Product(8,"motobike",900,18));
		al.add(new Product(9,"cycle",900,80));
		
		
		return al;
	}
}
