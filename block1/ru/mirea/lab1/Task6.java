package ru.mirea.lab1;

public class Task6 {
    public static void main(String[] args) {
        double harmonic = 0.0;
        System.out.printf("%-5s %-15s%n", "n", "H(n)");
        System.out.println("-------------------");
        for (int i = 1; i <= 10; i++) {
            harmonic += 1.0 / i;
            System.out.printf("%-5d %-15.6f%n", i, harmonic);
        }
    }
}