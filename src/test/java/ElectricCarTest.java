import cars.ElectricCar;
import components.Breaks;
import components.ElectricMotor;
import components.SteeringSystem;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Tyres tyres;
    Breaks breaks;
    SteeringSystem steeringSystem;
    ElectricMotor electricMotor;


    @Before
    public void before(){

        tyres = new Tyres("Goodyear");
        breaks = new Breaks("Goodyear");
        steeringSystem = new SteeringSystem("Goodyear");
        electricMotor = new ElectricMotor("Goodyear");
        electricCar = new ElectricCar(20000.00, "red", "Tesla", "E56", 0, tyres, breaks, steeringSystem, electricMotor);
    }

    @Test
    public void testStartEmpty(){
        assertEquals(0, electricCar.getFuelLevel());
    }

    @Test
    public void canFill(){
        electricCar.fill();
        assertEquals(100, electricCar.getFuelLevel());
    }

    @Test
    public void canStart(){
        assertEquals("Tesla E56 has started!", electricCar.startCar());
    }

    @Test
    public void canAddDamage(){
        electricCar.addDamage(500);
        assertEquals(19500.00, electricCar.getPrice(), 0.0);
    }



}
