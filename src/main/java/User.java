

public class User {

    private static long ID;
    private static long id_next;
    private String name;
    private String gender;

    public User(String name, String gender) {
        this.name = name;
        this.gender = gender;

        ID += id_next;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

}
