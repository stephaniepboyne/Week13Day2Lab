import cars.ElectricCar;
import cars.HybridCar;
import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HybridCarTest {
    HybridCar hybridCar;
    Tyres tyres;
    Breaks breaks;
    SteeringSystem steeringSystem;
    ElectricMotor electricMotor;
    Engine engine;

    @Before
    public void before(){
        tyres = new Tyres("Goodyear");
        breaks = new Breaks("Goodyear");
        steeringSystem = new SteeringSystem("Goodyear");
        electricMotor = new ElectricMotor("Goodyear");
        engine = new Engine("Goodyear", 1800);
        hybridCar = new HybridCar(20000.00, "red", "Tesla", "E56", 0, tyres, breaks, steeringSystem, engine, electricMotor);
    }

    @Test
    public void testStartEmpty(){
        assertEquals(0, hybridCar.getFuelLevel());
    }

    @Test
    public void canStart(){
        assertEquals("Tesla E56 has started!", hybridCar.startCar());
    }

    @Test
    public void canFill(){
        hybridCar.fill();
        assertEquals(100, hybridCar.getFuelLevel());
    }
}
