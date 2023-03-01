import java.util.Comparator;

public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "{" + name +
                " age " + age + "}";
    }

    @Override
    public int compareTo(User u1) {
        return this.getName().compareTo(u1.getName());
    }


}
