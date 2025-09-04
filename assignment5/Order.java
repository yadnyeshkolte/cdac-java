package assignment5;

abstract class Order {
	int orderId;
	String customerName;
	float amount;
	
	Order(int orderId, String customerName, float amount) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}
	abstract void generateInvoice();
}
class OnlineOrder extends Order{
	OnlineOrder(int orderId, String coustomerName, float amount) {
		super(orderId, coustomerName, amount);
	}
	void generateInvoice() {
		System.out.println(orderId+" "+customerName+" "+(amount+amount*0.02));
	}
}
class StoreOrder extends Order{
	StoreOrder(int orderId, String coustomerName, float amount) {
		super(orderId, coustomerName, amount);
	}
	void generateInvoice() {
		System.out.println(orderId+" "+customerName+" "+(amount-amount*0.03));
	}
}