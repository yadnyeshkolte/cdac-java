package assignment4updated.bankaccount;

public class BankAccount {
	long accountNumber;
	float balance;
	
	BankAccount(){
	accountNumber=0000000000;
	balance=0.0f;
	}
	BankAccount(long accountNumber,float balance){
		this.accountNumber=accountNumber;
		this.balance=balance;			
	}
	void calculateInterest() {
		System.out.println("Your balance after interest "+balance+balance*0.02);
	}
	
}

class SavingsAccount extends BankAccount{
	
	
	SavingsAccount(long accountNumber, float balance){
		super(accountNumber, balance);
	}
	@Override
	void calculateInterest() {
		System.out.println("Your balance after interest in Saving Account "+balance+balance*0.04);
	}
	
}

class FixedDepositAccount extends BankAccount{
	FixedDepositAccount(long accountNumber, float balance){
		super(accountNumber, balance);
	}
	@Override
	void calculateInterest() {
		System.out.println("Your balance after interest in Fixed Deposit Account "+balance+balance*0.07);
	}
}

