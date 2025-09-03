package assignment4updated.bankaccount;

public class BankAccoutMain {
	public static void main(String[] args) {
		long accountNumber = 8468465482l;
		float balance = 900000.0f;
		BankAccount b = new BankAccount(accountNumber,balance);
		SavingsAccount s = new SavingsAccount(accountNumber,balance);
		FixedDepositAccount f = new FixedDepositAccount(accountNumber,balance);
		
		b.calculateInterest();
		s.calculateInterest();
		f.calculateInterest();
	}
}
