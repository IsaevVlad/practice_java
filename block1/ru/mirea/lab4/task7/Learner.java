package ru.mirea.lab4.task7;

public class Learner {
    private String name;

    public Learner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return "Учащийся";
    }

    @Override
    public String toString() {
        return getKind() + ": " + name;
    }
}
