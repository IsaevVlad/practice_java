package ru.mirea.lab4.task9;

public class Table extends Furniture {
    public Table(String name, double price, String material) {
        super(name, price, material);
    }

    @Override
    public String getType() {
        return "Стол";
    }
}
