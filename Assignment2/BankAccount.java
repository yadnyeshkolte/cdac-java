

public class BankAccount {
    long accountNumber;
    String holderName;
    int balance;

    BankAccount(long accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    int deposit(int amount) {
        return this.balance += amount;
    }
    int withdraw(int amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
        }
        else {
            System.out.print("Insufficient balance: ");
        }
        return this.balance;
    }
    int checkBalance() {
        return this.balance;
    }
}
