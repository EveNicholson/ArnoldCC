package org.example;

public abstract class Car {
    private Engine engine;
    private String color;
    private int price;
    private int damage;

    public Car(Engine engine, String color, int price) {
        this.engine = engine;
        this.color = color;
        this.price = price;
        this.damage = 0;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price*(100-damage)/100;
    }

    public void addDamage(int amount) {
        damage += amount;
        if (damage > 100){
            damage = 100;
        }
    }

    public void removeDamage(int amount) {
        damage -= amount;
    }
    public int getDamage() {
        return damage;
    }
}
