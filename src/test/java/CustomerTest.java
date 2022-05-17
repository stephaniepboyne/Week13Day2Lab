import cars.ElectricCar;
import cars.PetrolCar;
import components.*;
import customerAndDealership.Customer;
import customerAndDealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Dealership dealership;
    ElectricCar electricCar;
    Tyres tyres;
    Breaks breaks;
    SteeringSystem steeringSystem;
    ElectricMotor electricMotor;
    PetrolCar petrolCar;
    Engine engine;

    @Before
    public void before(){
        tyres = new Tyres("Goodyear");
        breaks = new Breaks("Goodyear");
        steeringSystem = new SteeringSystem("Goodyear");
        engine = new Engine("Goodyear", 1800);
        electricMotor = new ElectricMotor("Goodyear");
        customer = new Customer("Bobby", 30000.00);
        dealership = new Dealership("CodeClan Cars", 10000.00);
        electricCar = new ElectricCar(20000.00, "red", "Tesla", "E56", 0, tyres, breaks, steeringSystem, electricMotor);
        petrolCar = new PetrolCar(10000.00, "blue", "Tesla", "D20", 0, tyres, breaks, steeringSystem, engine);
        dealership.getCarsInDealership().add(electricCar);
        dealership.getCarsInDealership().add(petrolCar);
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(electricCar, dealership, customer);
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(10000.00, customer.getMoney(), 0.0);
        assertEquals(1, dealership.getCarsInDealership().size());
        assertEquals(30000.00, dealership.getTill(), 0.0);
    }

}
