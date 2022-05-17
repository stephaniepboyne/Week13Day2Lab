import cars.Car;
import cars.ElectricCar;
import cars.HybridCar;
import cars.PetrolCar;
import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Tyres tyres;
    Breaks breaks;
    SteeringSystem steeringSystem;
    Engine engine;

    @Before
    public void before(){

        tyres = new Tyres("Goodyear");
        breaks = new Breaks("Goodyear");
        steeringSystem = new SteeringSystem("Goodyear");
        engine = new Engine("Goodyear", 1800);
        petrolCar = new PetrolCar(10000.00, "blue", "Tesla", "D20", 0, tyres, breaks, steeringSystem, engine);
    }

    @Test
    public void testStartEmpty(){
        assertEquals(0, petrolCar.getFuelLevel());
    }

    @Test
    public void canFill(){
        petrolCar.fill();
        assertEquals(100, petrolCar.getFuelLevel());
    }

    @Test
    public void canStart(){
        assertEquals("Tesla D20 has started!", petrolCar.startCar());
    }
}
