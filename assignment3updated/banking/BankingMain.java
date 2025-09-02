package assignment3updated.banking;

public class BankingMain {
	public static void main() {
		
		CurrentAccount[] currentAccount = new CurrentAccount[5];
		SavingsAccount[] savingsAccount = new SavingsAccount[5];
		
		CurrentAccounts c = new CurrentAccounts();
		SavingsAccounts s = new SavingsAccounts();
		
		currentAccount = c.createAccount();
		savingsAccount = s.createAccount();
		
		for(int i=0;i<currentAccount.length;i++) {
			System.out.println(currentAccount[i].holderName+"'s Total Charged Balance "+currentAccount[i].applyServiceCharge(CurrentAccount.charge));
		}
		System.out.println("======================");
		for(int i=0;i<savingsAccount.length;i++) {
			System.out.println(savingsAccount[i].holderName+"'s Total Intrest Balance "+savingsAccount[i].addInterest(SavingsAccount.rate));
		}
	}
}
