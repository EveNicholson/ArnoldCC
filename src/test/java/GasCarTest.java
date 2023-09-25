import org.example.Car;
import org.example.Engine;
import org.example.GasCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasCarTest {
    private Car car;
    private Engine engine;

    @Before
    public void before() {
        engine = new Engine();
        car = new GasCar(engine, "Yellow", 100);

    }

    @Test
    public void CanAddDamage() {
        car.addDamage(20);
        assertEquals(80, car.getPrice());
    }

    @Test
    public void CanRemoveDamage() {
        car.addDamage(20);
        car.removeDamage(10);
        assertEquals(90, car.getPrice());
    }
    @Test
    public void cantDamageMoreThen100() {
        car.addDamage(123);
        assertEquals(100, car.getDamage());
    }
}
