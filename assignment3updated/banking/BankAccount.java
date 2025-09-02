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
	float rate;
	SavingsAccount(){
		rate = 0.0f;
	}
	SavingsAccount(long accountNumber, String holderName, int balance, float rate){
		super(accountNumber, holderName, balance);
	}
	float addInterest(float rate) {
		return balance+balance*rate;
		
	}
	
}

class CurrentAccount extends BankAccount{
	double charge;
	CurrentAccount(){
		charge = 0.0f;
	}
	CurrentAccount(long accountNumber, String holderName, int balance, double charge){
		super(accountNumber, holderName, balance);
	}
	double applyServiceCharge(double charge) {
		return balance+balance*charge;
		
	}
	
}
