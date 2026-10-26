package ru.mirea.lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Ввод элементов с помощью do while
        int i = 0;
        do {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            i++;
        } while (i < n);

        // Сумма с помощью while
        int sum = 0;
        int j = 0;
        while (j < arr.length) {
            sum += arr[j];
            j++;
        }

        // Поиск max и min
        int max = arr[0];
        int min = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] > max) max = arr[k];
            if (arr[k] < min) min = arr[k];
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);

        sc.close();
    }
}