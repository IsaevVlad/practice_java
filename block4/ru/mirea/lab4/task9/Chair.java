package ru.mirea.lab4.task9;

public class Chair extends Furniture {
    public Chair(String name, double price, String material) {
        super(name, price, material);
    }

    @Override
    public String getType() {
        return "Стул";
    }
}
