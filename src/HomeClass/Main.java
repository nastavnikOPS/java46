package HomeClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        Collections.sort(cars);
        System.out.println(cars);
    }
}
