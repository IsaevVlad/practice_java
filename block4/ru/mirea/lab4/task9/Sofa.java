package ru.mirea.lab4.task9;

public class Sofa extends Furniture {
    public Sofa(String name, double price, String material) {
        super(name, price, material);
    }

    @Override
    public String getType() {
        return "Диван";
    }
}
