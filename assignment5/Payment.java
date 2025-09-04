package assignment5;

interface Payment {
	void processPayment(double amount);
	void refund(double amount);
}

class CreditCardPayment implements Payment{
	long transactionId;
	long accountNumber;
	
	public CreditCardPayment(long transactionId, long accountNumber) {
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
	}
	
	public void processPayment(double amount) {
		System.out.println(amount+" Amount is added "+" to Account Number "+accountNumber+" transactionID "+transactionId);
	}
	public void refund(double amount) {
		System.out.println(amount+" Amount is refunded "+" to Account Number "+accountNumber+" transactionID "+transactionId);
	}
	
}
class UPIPayment implements Payment{
	long transactionId;
	long accountNumber;
	
	public UPIPayment(long transactionId, long accountNumber) {
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
	}
	public void processPayment(double amount) {
		System.out.println(amount+" Amount is added "+" to Account Number "+accountNumber+" transactionID "+transactionId);
	}
	public void refund(double amount) {
		System.out.println(amount+" Amount is refunded "+" to Account Number "+accountNumber+" transactionID "+transactionId);
	}
	
}
