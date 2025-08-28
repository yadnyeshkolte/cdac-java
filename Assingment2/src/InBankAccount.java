package Hello.Assingment2.src;

import java.util.Scanner;

class InBankAccount {
    static void main(){
        Scanner scanBank = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        long accountNumber = Long.parseLong(scanBank.nextLine());

        System.out.print("Enter Holder Name: ");
        String holderName = scanBank.nextLine();

        System.out.print("Enter Balance: ");
        int holderBalance = Integer.parseInt(scanBank.nextLine());

        BankAccount h = new BankAccount(accountNumber, holderName, holderBalance);
        while(true){
            System.out.print("Want to try ot some Methods yes/no: ");
            String input = scanBank.nextLine();
            if(input.equals("yes")){
                System.out.print("'d' - deposit 'w' - withdraw 'ck' - Check Balance: ");
                switch(scanBank.nextLine()){
                  case "d": System.out.print("Enter Amount to Deposit: ");
                  int newAmount = Integer.parseInt(scanBank.nextLine());
                  System.out.println(h.deposit(newAmount));
                  break;
                  case "w": System.out.print("Enter Amount to Withdraw: ");
                  int newWithdraw = Integer.parseInt(scanBank.nextLine());
                  System.out.println(h.withdraw(newWithdraw));
                  break;
                  case "ck": System.out.print(h.checkBalance());
                  System.out.println(" ");
                  break;
                  default: System.out.println("Invalid Input");
                }
            }
            else if(input.equals("no")){
                break;
            }
        }
    }
}
