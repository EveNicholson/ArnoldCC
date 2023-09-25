import org.example.Car;
import org.example.Dealership;
import org.example.ElectricCar;
import org.example.Engine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    private Dealership dealership;
    private Car car;
    private Car car2;
    private Engine engine;

    @Before
    public void before () {
        engine=new Engine();
        car=new ElectricCar(engine,"Blue",113);
        car2=new ElectricCar(engine,"Green",73);
        dealership = new Dealership(6543, new ArrayList<>(Arrays.asList(car)));
    }
    @Test
    public void canSellACar(){
        dealership.sell(car);
        assertEquals(new ArrayList<>(), dealership.getGarage());
        assertEquals(6656, dealership.getTill());
    }

    @Test
    public void canBuyACar() {
        dealership.buy(car2);
        assertEquals(car2,dealership.getGarage().get(1));
        assertEquals(6470, dealership.getTill());
    }
    @Test
    public void canRepairACar() {
        car.addDamage(10);
        assertEquals(101, car.getPrice());
        dealership.repair(car);
        assertEquals(0,car.getDamage());
        assertEquals(113, car.getPrice());
        assertEquals(6531,dealership.getTill());
    }
}
