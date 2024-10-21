package lesson14;

import java.util.Random;
import java.util.function.Supplier;

public class RandomCountGenerator implements Supplier {
    @Override
    public Integer get() {
        return new Random().nextInt();
    }
}
