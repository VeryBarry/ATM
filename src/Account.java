import java.util.Scanner;


/**
 * Created by VeryBarry on 9/15/16.
 */
public class Account {

    String name;
    double balance = 100.00;
    public String operation;
    double withdrawMoney;
    double depositMoney;

    void setName() throws Exception{
        System.out.println("Welcome! What's your name?");
        name = ATM.scanner.nextLine();
        if (name.equalsIgnoreCase("")){
            setName();
        }
        else {
            System.out.println("Hey, " + name + ".");
        }
    }

    void atmOperations() {
        System.out.println("What would you like to do?");
        System.out.println("You can: Deposit, Withdraw, Balance, or Cancel");
        operation = ATM.scanner.nextLine();
        if (operation.equalsIgnoreCase("balance")){
            System.out.println(balance);
        }
        if (operation.equalsIgnoreCase("withdraw")){
            System.out.println("You have $" + balance + ".");
            System.out.println("How much would you like to withdraw?");
            withdrawMoney = ATM.scanner.nextDouble();
            balance = balance - withdrawMoney;
            System.out.println("You now have: $" + balance);
        }
        if (operation.equalsIgnoreCase("deposit")){
            System.out.println("How much are you depositing?");
            depositMoney = ATM.scanner.nextDouble();
            System.out.println("Depositing: $" + depositMoney);
            balance = balance +depositMoney;
            System.out.println("You now have: $" + balance);
        }
        if (operation.equalsIgnoreCase("cancel")){

        }
        else if (operation.equalsIgnoreCase("")){
            System.out.println("Not a valid input. Please try again.");
            atmOperations();
        }
    }
}
