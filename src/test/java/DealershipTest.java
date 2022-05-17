import cars.ElectricCar;
import cars.PetrolCar;
import components.*;
import customerAndDealership.Customer;
import customerAndDealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

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
        dealership = new Dealership("CodeClan Cars", 12000.00);
        electricCar = new ElectricCar(20000.00, "red", "Tesla", "E56", 0, tyres, breaks, steeringSystem, electricMotor);
        petrolCar = new PetrolCar(10000.00, "blue", "Tesla", "D20", 0, tyres, breaks, steeringSystem, engine);
        dealership.getCarsInDealership().add(electricCar);
    }

    @Test
    public void canBuyCar(){
        dealership.buyCar(petrolCar);
        assertEquals(2, dealership.getCarsInDealership().size());
        assertEquals(2000, dealership.getTill(), 0.0);
    }

    @Test
    public void canSellCar(){
        dealership.sellCar(electricCar, dealership, customer);
        assertEquals(0, dealership.getCarsInDealership().size());
        assertEquals(32000, dealership.getTill(), 0.0);
        assertEquals(10000, customer.getMoney(), 0.0);
        assertEquals(1, customer.getOwnedCars().size());
    }

    @Test
    public void canRepairVehicle(){
        dealership.repairVehicle(electricCar, 500);
        assertEquals(20500, electricCar.getPrice(),0.0);
        assertEquals(11500, dealership.getTill(), 0.0);
    }

}
