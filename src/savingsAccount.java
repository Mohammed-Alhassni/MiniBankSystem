public class savingsAccount extends bankAccount {
    double interestRate;

    public savingsAccount(String accountName, String accountNumber, double balance, double interestRate) {
        super(accountName, accountNumber, balance);
        this.interestRate=interestRate;
    }

    public void applyInterest(){
        balance= balance * (1+interestRate);
    }

    @Override
    public void showAccountInfo(){
        System.out.println("\nAccount Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance+ "\n");
        System.out.println("Interest Rate: " + interestRate);
    }
}
