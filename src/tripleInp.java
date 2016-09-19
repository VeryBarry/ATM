/**
 * Created by VeryBarry on 9/16/16.
 */
public class tripleInp {

    String userName;
    Double balance;
    String password;

    tripleInp(String userName, Double balance, String password) {

        setUser(userName);
        setBal(balance);
        setPass(password);
    }

    void setUser(String newUser) {
        newUser = userName;

    }

    void setBal(Double userBal) {
        userBal = balance;
    }

    void setPass(String userPass) {
        userPass = password;
    }

    Double getBal(Double balance){
        return balance;
    }
}
