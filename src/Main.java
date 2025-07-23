import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose the operation: \n 1. Create a new account \n 2. Deposit money \n 3. Withdraw money\n 4. View account details \n 5. Exit");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        switch (userChoice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}