import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();

        users.add(new User("Babken", 24));
        users.add(new User("Armen", 21));
        users.add(new User("Hayk", 29));
        users.add(new User("Grig", 23));
        users.add(new User("Tigran", 27));

        System.out.println(users);


        Set<Car> cars = new TreeSet<>(new CarComparatorModel());




        cars.add(new Car("BMW", 2012));
        cars.add(new Car("Audi", 2015));
        cars.add(new Car("Ford", 2022));
        cars.add(new Car("Toyota", 2017));
        cars.add(new Car("Toyota", 2022));
        cars.add(new Car("Honda", 2010));

        System.out.println(cars);

        MyArrayList<User> myUsers = new MyArrayList<>();

        myUsers.add(new User("Babken", 24));
        myUsers.add(new User("Armen", 21));
        myUsers.add(new User("Hayk", 29));
        myUsers.add(new User("Grig", 23));
        myUsers.add(new User("Tigran", 27));
        myUsers.add(new User("Garik", 27));
        myUsers.add(new User("Roman", 27));

        System.out.println(myUsers);

    }
}
