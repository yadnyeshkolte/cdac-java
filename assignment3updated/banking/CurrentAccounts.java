package assignment3updated.banking;

public class CurrentAccounts {
	CurrentAccount[] createAccount() {
		CurrentAccount[] account = new CurrentAccount[5];
		account[0] = new CurrentAccount(5468469547l,"Yadnyesh",117000);
		account[1] = new CurrentAccount(5464469547l,"Om",181000);
		account[2] = new CurrentAccount(4468469547l,"Adarsh",122000);
		account[3] = new CurrentAccount(5468462547l,"Sonakshi",13200);
		account[4] = new CurrentAccount(5463669547l,"Shravni",17000);
		
		return account;
	}
	
}
