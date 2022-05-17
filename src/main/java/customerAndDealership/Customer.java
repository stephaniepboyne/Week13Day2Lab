package customerAndDealership;

import cars.Car;

import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Car> ownedCars;
    private String name;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }

    public void buyCar(Car car, Dealership dealership, Customer customer){
        this.ownedCars.add(car);
        this.money -= car.getPrice();
        dealership.carsInDealership.remove(car);
        dealership.till += car.getPrice();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public String getName() {
        return name;
    }
}

