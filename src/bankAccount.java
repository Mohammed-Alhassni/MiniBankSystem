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
        System.out.println("Balance: " + balance);
    }

    public double deposit(double amount){
        balance= balance+ amount;
        System.out.println("Deposited "+amount);
        return balance;
    }

    public double withdraw(double amount){
        balance= balance- amount;
        System.out.println("Withdrawl "+amount);
        return balance;
    }
}
