package assignment5;

public class OrderTest {
	public static void main() {
		OnlineOrder o = new OnlineOrder(1,"yadnyesh",50000f);
		StoreOrder s = new StoreOrder(2,"om",4444f);
	
		o.generateInvoice();
		s.generateInvoice();
		
	}
}
