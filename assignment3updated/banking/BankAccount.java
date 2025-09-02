package assignment3updated.banking;

public class BankAccount {
	long accountNumber;
	String holderName;
	int balance;
	BankAccount(){
		accountNumber = 0000000000;
		holderName= "Empty";
		balance = 0;
	}
	BankAccount(long accountNumber, String holderName, int balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

}

class SavingsAccount extends BankAccount{
	static float rate = 0.07f;
	SavingsAccount(){
	}
	SavingsAccount(long accountNumber, String holderName, int balance){
		super(accountNumber, holderName, balance);
	}
	float addInterest(float rate) {
		return balance+balance*rate;
		
	}
	
}

class CurrentAccount extends BankAccount{
	static double charge = 0.07f;
	CurrentAccount(){
	}
	CurrentAccount(long accountNumber, String holderName, int balance){
		super(accountNumber, holderName, balance);
	}
	double applyServiceCharge(double charge) {
		return balance-balance*charge;
		
	}
	
}
