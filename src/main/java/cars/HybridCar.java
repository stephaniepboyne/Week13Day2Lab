package cars;

import components.*;


public class HybridCar extends Car {
    private Engine engine;
    private ElectricMotor electricMotor;

    public HybridCar(double price, String colour, String manufacturer, String model, int fuelLevel, Tyres tyres, Breaks breaks, SteeringSystem steeringSystem, Engine engine, ElectricMotor electricMotor) {
        super(price, colour, manufacturer, model, fuelLevel, tyres, breaks, steeringSystem);
        this.engine = engine;
        this.electricMotor = electricMotor;
    }
}
