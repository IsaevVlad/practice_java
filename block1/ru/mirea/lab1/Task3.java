package ru.mirea.lab1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, -3, 20, 8, 1, 15, 4, 6};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + avg);
    }
}