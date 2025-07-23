import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<bankAccount> userAccounts=new ArrayList<bankAccount>();
        boolean isContinue=true;
        while(isContinue){
            System.out.println("Choose the operation: \n 1. Create a new account \n 2. Deposit money \n 3. Withdraw money\n 4. View account details \n 5. Exit");
            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();
            switch (userChoice){
                case 1:
                    userAccounts.add(createAccount());
                    break;
                case 2:
                    System.out.println("Enter the deposit amount: ");
                    double depositAmount= sc.nextDouble();
                    userAccounts.get(userAccounts.size()-1).deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the withdrawl amount: ");
                    double withdrawlAmount= sc.nextDouble();
                    userAccounts.get(userAccounts.size()-1).deposit(withdrawlAmount);
                    break;
                case 4:
                    userAccounts.get(userAccounts.size()-1).showAccountInfo();
                    break;
                case 5:
                    isContinue=false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static bankAccount createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account name: ");
        String name = sc.nextLine();
        System.out.println("Enter account number: ");
        String number = sc.nextLine();
        System.out.println("Enter account balance: ");
        double amount = sc.nextDouble();

        bankAccount user= new bankAccount(name, number, amount);
        user.showAccountInfo();

        return user;
    }
}