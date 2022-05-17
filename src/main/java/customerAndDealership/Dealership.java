package customerAndDealership;

import cars.Car;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Car> carsInDealership;
    double till;
    String name;

    public Dealership(String name, double till) {
        this.carsInDealership = new ArrayList<>();
        this.name = name;
        this.till = till;
    }

    public ArrayList<Car> getCarsInDealership() {
        return carsInDealership;
    }

    public double getTill() {
        return till;
    }

    public String getName() {
        return name;
    }

    public void buyCar(Car car){
        till -= car.getPrice();
        carsInDealership.add(car);
    }

    public void sellCar(Car car, Dealership dealership, Customer customer){
        customer.buyCar(car, dealership, customer);
    }

    public void repairVehicle(Car car, double cost){
        till -= cost;
        double price = car.getPrice();
        car.setPrice(price + cost);
    }
}
