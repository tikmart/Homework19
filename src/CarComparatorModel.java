import java.util.Comparator;

public class CarComparatorModel implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        return c1.getModel().compareTo(c2.getModel());
    }
}
