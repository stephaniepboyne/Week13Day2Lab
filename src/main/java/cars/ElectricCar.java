package cars;

import components.Breaks;
import components.ElectricMotor;
import components.SteeringSystem;
import components.Tyres;



public class ElectricCar extends Car {

    private ElectricCar electricCar;
    private ElectricMotor electricMotor;

    public ElectricCar(double price, String colour, String manufacturer, String model, int fuelLevel, Tyres tyres, Breaks breaks, SteeringSystem steeringSystem, ElectricMotor electricMotor) {
        super(price, colour, manufacturer, model, fuelLevel, tyres, breaks, steeringSystem);
        this.electricMotor = electricMotor;
    }

}
