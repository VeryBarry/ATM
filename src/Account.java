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

    public static Scanner scanner = new Scanner(System.in);

    HashMap<String, tripleInp> account = new HashMap<>();

    public static void main(String args) {

        welcomeATM();
        accounts();
        atmOperations();

        System.out.println("Have a nice day!");
    }


    void welcomeATM() {
        System.out.println("Welcome. All your moneys are belong to us.");
    }

    void accounts() {

        System.out.print("Enter your username: ");
        userUsed = scanner.nextLine();

        if (account.containsKey(userUsed)) {
           account.get(userUsed);
        }
        else {
            System.out.println("That's not a valid User Name. Would you like to create one?");
            System.out.println("Press 1 for Yes, 2 for No.");
            int input = scanner.nextInt();
            if (!account.containsKey(input)) {
                account.put(userName, 0);
                System.out.println("User name accepted.");
                System.out.println("Now we just need a password.");
                System.out.print("Enter Password:");
                String userPass = scanner.nextLine();
                //account.put(tripleInp.setPass);
            }
            else {
                accounts();
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

//            System.out.println("Enter username:");
//    String name = scanner.nextLine();
//
//        if (!users.containsKey(name)) {
//        Person p = new Person(name, 20, true);
//        users.put(name, p);
//    }
//
//    Person person = users.get(name);
//
//        System.out.println("Logged in as: " + person.name);
//}




}
