package ru.mirea.lab1;

public class Task7 {

    // Метод вычисления факториала
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Проверка работы метода
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }

        // Проверка крайнего случая
        System.out.println("20! = " + factorial(20));
    }
}