import java.util.List;

public class User {

    private String name;
    private String gender;
    private List<Account> account;

    public User() {
    }

    public User(String name, String gender, List<Account> account) {
        this.name = name;
        this.gender = gender;
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }
}
