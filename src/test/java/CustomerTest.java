import org.example.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    private Dealership dealership;
    private Car car;
    private Engine engine;

    @Before
    public void before () {
        customer = new Customer(123, new ArrayList<>());
        dealership = new Dealership(654322, new ArrayList<>());
        engine = new Engine();
        car = new ElectricCar(engine, "Red", 100);

    }
    @Test
    public void canBuyACar() {
        customer.buy(dealership, car);
        assertEquals(car,customer.getGarage().get(0));
        assertEquals(23,customer.getWallet());
        assertEquals(654422, dealership.getTill());
    }
}
