import java.util.Scanner;

public class bankAccount {
    String accountName;
    String accountNumber;
    double balance;

    public bankAccount(String accountName, String accountNumber, double balance) {
        this.accountName=accountName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }


    public void showAccountInfo(){
        System.out.println("\nAccount Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance+ "\n");
    }

    public void deposit(double amount){
        balance= balance+ amount;
        System.out.println("Deposited "+amount);
        System.out.println("New Balance"+balance);
    }

    public void withdraw(double amount){
        balance= balance- amount;
        System.out.println("Withdrawl "+amount);
        System.out.println("New Balance"+balance);
    }
}
