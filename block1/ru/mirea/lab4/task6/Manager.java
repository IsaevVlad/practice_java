package ru.mirea.lab4.task6;

public class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    public double getAverageSum() {
        return averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }

    @Override
    public String toString() {
        return super.toString() + ", выплаты за продажи = " + averageSum;
    }
}
