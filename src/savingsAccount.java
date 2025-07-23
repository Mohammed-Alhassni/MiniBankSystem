public class savingsAccount extends bankAccount {
    double interestRate;

    public savingsAccount(String accountName, String accountNumber, double balance, double interestRate) {
        super(accountName, accountNumber, balance);
        this.interestRate=interestRate;
    }

    public void applyInterest(){
        balance= balance * (1+interestRate);
    }
}
