/**
 * Created by VeryBarry on 9/16/16.
 */
public class User {
    String name;
    Double balance;
    String password;

    public User(String name, Double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBal() {
        return balance;
    }

    public void setBal(Double balance) {
        this.balance = balance;
    }

    public String getPass() {
        return password;
    }

    public void setPass(String password) {
        this.password = password;
    }
}
