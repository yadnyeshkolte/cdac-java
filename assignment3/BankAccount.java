package assignment3;

class BankAccount {
	
	long accountNumber;
	double balance;
	
	BankAccount(){
		accountNumber = 0000000000;
		balance = 0;
	}
	BankAccount(long accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	double deposit(double amount){
		return this.balance+=amount;
	}
}

class SavingsAccount extends BankAccount{
	
	float intrestRate;
	
	SavingsAccount(){
		accountNumber = 0000000000;
		balance = 0;
		intrestRate = 0.07f;
	}
	
	SavingsAccount(long accountNumber, double balance, float intrestRate){
		this.accountNumber = 0000000000;
		this.balance = 0;
		this.intrestRate = 0.07f;
	}
	
	double calculateInterest() {
		return this.balance * this.intrestRate;
	}
}

