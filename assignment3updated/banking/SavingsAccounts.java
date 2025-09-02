package assignment3updated.banking;

public class SavingsAccounts {
	SavingsAccount[] createAccount() {
		SavingsAccount[] account = new SavingsAccount[5];
		account[0] = new SavingsAccount(5468469547l,"Yadnyesh",117000);
		account[1] = new SavingsAccount(5464469547l,"Om",181000);
		account[2] = new SavingsAccount(4468469547l,"Adarsh",122000);
		account[3] = new SavingsAccount(5468462547l,"Sonakshi",13200);
		account[4] = new SavingsAccount(5463669547l,"Shravni",17000);
		
		return account;
	}
	
}
