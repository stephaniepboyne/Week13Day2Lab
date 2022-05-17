package cars;

import components.Breaks;
import components.Engine;
import components.SteeringSystem;
import components.Tyres;

public class PetrolCar extends Car {
    private Engine engine;

    public PetrolCar(double price, String colour, String manufacturer, String model, int fuelLevel, Tyres tyres, Breaks breaks, SteeringSystem steeringSystem, Engine engine) {
        super(price, colour, manufacturer, model, fuelLevel, tyres, breaks, steeringSystem);
        this.engine = engine;
    }
}
