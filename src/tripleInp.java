/**
 * Created by VeryBarry on 9/16/16.
 */
public class tripleInp {
    String userName;
    Double balance;
    String password;

    tripleInp(String password,Double balance) {
        setBal(balance);
        setPass(password);
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
