import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by VeryBarry on 9/15/16.
 */
public class Account {

    String operation;
    Double withdrawMoney;
    Double depositMoney;
    Double balance;
    String userUsed;
    String userName;

    Scanner scanner = new Scanner(System.in);

    static HashMap<String, tripleInp> accounts = new HashMap<>();

    void accounts() {
        System.out.print("Enter your username: ");
        userUsed = scanner.nextLine();

        if (tripleInp.containsKey(userUsed)) {
           tripleInp.get(userUsed);
            atmOperations();
        }
        else {
            System.out.println("That's not a valid User Name. Would you like to create one?");
            System.out.println("Press 1 for Yes, 2 for No.");
            int input = scanner.nextInt();
            if (input == 1) {
                if (accounts.containsKey(1)) {
                    System.out.println("User name accepted.");
                    System.out.println("Now we just need a password.");
                    System.out.print("Enter Password:");
                    String userPass = scanner.nextLine();
                    tripleInp account = new tripleInp(userUsed, 100.00, userPass);
                    tripleInp.put(userUsed, 100, userPass);
                }
            }else {
                Account();
            }
        }
    }

    void atmOperations() {
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("What would you like to do?");
            System.out.println("You can: Deposit, Withdraw, Balance, or Cancel");
            operation = scanner.nextLine();
            if (operation.equalsIgnoreCase("balance")) {
                //System.out.println(tripleInp.getBal);
            }
            if (operation.equalsIgnoreCase("withdraw")) {
                System.out.println("You have $" + balance + ".");
                System.out.println("How much would you like to withdraw?");
                withdrawMoney = scanner.nextDouble();
                balance = balance - withdrawMoney;
                System.out.println("You now have: $" + balance);
            }
            if (operation.equalsIgnoreCase("deposit")) {
                System.out.println("How much are you depositing?");
                depositMoney = scanner.nextDouble();
                System.out.println("Depositing: $" + depositMoney);
                balance = balance + depositMoney;
                System.out.println("You now have: $" + balance);
            }
            if (operation.equalsIgnoreCase("cancel")) {
                keepRunning = false;
            }
            else if (operation.equalsIgnoreCase("")) {
                System.out.println("Not a valid input. Please try again.");
                continue;
            }
        }
    }
}
