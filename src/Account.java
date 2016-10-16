import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by VeryBarry on 9/15/16.
 */
public class Account {

    static HashMap<String, User> accounts = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static User user;

    public static void main(String[] args) {

        System.out.println("Welcome. All your moneys are belong to us.");

        boolean keepRunning = true;
        while (keepRunning) {

            System.out.print("Enter your username: ");
            String userUsed = scanner.nextLine();

            if (!accounts.containsKey(userUsed) && keepRunning == true) {
                System.out.println("That's not a valid User Name. Would you like to create one?");
                System.out.println("Press 1 for Yes, 2 for No.");
                int input = scanner.nextInt();
                if (input == 1) {
                    if (!accounts.containsKey(userUsed)) {
                        System.out.println("User name accepted.");
                        System.out.println("Now we just need a password.");
                        System.out.print("Enter Password:");
                        String userPass = scanner.nextLine();
                        scanner.nextLine();
                        user = new User(userUsed, 100.00, userPass);
                        accounts.put(userUsed, user);
                    }
                }
            } else {
                keepRunning = false;
            }


            boolean keepRunning2 = true;
            while (keepRunning2) {

                System.out.println("What would you like to do?");
                System.out.println("You can: Deposit, Withdraw, Balance, or Cancel");
                String operation = scanner.nextLine();
                scanner.nextLine();
                if (operation.equalsIgnoreCase("balance")) {
                    System.out.println(user.balance);
                }
                if (operation.equalsIgnoreCase("withdraw")) {
                    System.out.println("You have $" + user.balance + ".");
                    System.out.println("How much would you like to withdraw?");
                    double withdrawMoney = scanner.nextDouble();
                    double balance = user.balance - withdrawMoney;
                    System.out.println("You now have: $" + balance);
                    user.setBal(balance);
                }
                if (operation.equalsIgnoreCase("deposit")) {
                    System.out.println("How much are you depositing?");
                    double depositMoney = scanner.nextDouble();
                    System.out.println("Depositing: $" + depositMoney);
                    double balance = user.balance + depositMoney;
                    System.out.println("You now have: $" + balance);
                    user.setBal(balance);
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