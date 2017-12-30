
import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String password;
    private ArrayList<Account> account;
    private long accountNumber_next;
    private long accountNumber;
    private long userId;

    public User(String name, long userId) {
        this.name = name;
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount() {
        account = new ArrayList<> ();
    }

    public long getAccountNumber() {
        return accountNumber_next;
    }


//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                ", account=" + account +
//                '}';
//    }
}
