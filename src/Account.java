import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by VeryBarry on 9/15/16.
 */
public class Account {


    public static void main(String[] args) {

        String operation;
        Double withdrawMoney;
        Double depositMoney;
        Double balance;

        Scanner scanner = new Scanner(System.in);

        HashMap<String, User> accounts = new HashMap<>();

        System.out.println("Welcome. All your moneys are belong to us.");

        boolean keepRunning = true;
        while (keepRunning) {

            System.out.print("Enter your username: ");
            String userUsed = scanner.nextLine();

            if (!accounts.containsKey(userUsed)) {
                System.out.println("That's not a valid User Name. Would you like to create one?");
                System.out.println("Press 1 for Yes, 2 for No.");
                int input = scanner.nextInt();
                if (input == 1) {
                    if (accounts.containsKey(1)) {
                        System.out.println("User name accepted.");
                        System.out.println("Now we just need a password.");
                        System.out.print("Enter Password:");
                        String userPass = scanner.nextLine();
                        User newAccount = new User(userPass, 100.00);
                        accounts.put(userUsed, newAccount);
                    }
                }
            } else {
                keepRunning = false;
            }

            boolean keepRunning2 = true;
            while (keepRunning2) {

                System.out.println("What would you like to do?");
                System.out.println("You can: Deposit, Withdraw, Balance, or Cancel");
                operation = scanner.nextLine();
                if (operation.equalsIgnoreCase("balance")) {
                    System.out.println(User.getBal);
                }
                if (operation.equalsIgnoreCase("withdraw")) {
                    System.out.println("You have $" + accounts.balance + ".");
                    System.out.println("How much would you like to withdraw?");
                    withdrawMoney = scanner.nextDouble();
                    balance = User.getBal - withdrawMoney;
                    System.out.println("You now have: $" + balance);
                    User.setBal(balance);
                }
                if (operation.equalsIgnoreCase("deposit")) {
                    System.out.println("How much are you depositing?");
                    depositMoney = scanner.nextDouble();
                    System.out.println("Depositing: $" + depositMoney);
                    balance = accounts.balance + depositMoney;
                    System.out.println("You now have: $" + balance);
                    User.setBal(balance);
                }
                if (operation.equalsIgnoreCase("cancel")) {
                    keepRunning2 = false;
                } else if (operation.equalsIgnoreCase("")) {
                    System.out.println("Not a valid input. Please try again.");
                    continue;
                }
            }
        }

    }
}