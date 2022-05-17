package cars;

import components.Breaks;
import components.SteeringSystem;
import components.Tyres;

public abstract class Car {
    private double price;
    private String colour;
    private String manufacturer;
    private String model;
    private int fuelLevel;

    private Tyres tyres;
    private Breaks breaks;
    private SteeringSystem steeringSystem;

    public Car(double price, String colour, String manufacturer, String model, int fuelLevel, Tyres tyres, Breaks breaks, SteeringSystem steeringSystem) {
        this.price = price;
        this.colour = colour;
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.tyres = tyres;
        this.breaks = breaks;
        this.fuelLevel = fuelLevel;
        this.steeringSystem = steeringSystem;
    }

    public String startCar(){
        return "" + manufacturer + " " + model + " has started!";
    }

    public void fill(){
        this.fuelLevel = 100;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public double getPrice() {
        return price;
    }

    public void addDamage(double cost){
        this.price -= cost;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

