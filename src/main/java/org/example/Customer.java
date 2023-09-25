package org.example;

import java.util.ArrayList;

public class Customer {
    private int wallet;
    private ArrayList<Car> garage;

    public Customer(int wallet, ArrayList<Car> garage) {
        this.wallet = wallet;
        this.garage = garage;
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Car> getGarage() {
        return garage;
    }

    public void buy(Dealership dealership, Car car) {
        dealership.sell(car);
        garage.add(car);
        wallet-=car.getPrice();
    }
}
