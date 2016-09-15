import java.util.Scanner;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class ATM {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean keepRunning = true;

        Account account = new Account();
        account.setName();
        account.atmOperations();


        System.out.println("Have a nice day!");
    }
}
