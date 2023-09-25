package org.example;

import java.util.ArrayList;

public class Dealership {
    private int till;
    private ArrayList<Car> garage;

    public Dealership(int till, ArrayList<Car> garage) {
        this.till = till;
        this.garage = garage;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Car> getGarage() {
        return garage;
    }
    public void sell(Car car) {
        garage.remove(car);
        till+=car.getPrice();
    }

    public void buy(Car car) {
        garage.add(car);
        till-=car.getPrice();
    }
    public void repair(Car car) {

        int damage = car.getDamage();
        int initialPrice = car.getPrice();
        car.removeDamage(damage);
        int price = car.getPrice();
        till-=(price - initialPrice);
    }

}
