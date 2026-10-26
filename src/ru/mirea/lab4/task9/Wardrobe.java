package ru.mirea.lab4.task9;

public class Wardrobe extends Furniture {
    public Wardrobe(String name, double price, String material) {
        super(name, price, material);
    }

    @Override
    public String getType() {
        return "Шкаф";
    }
}
