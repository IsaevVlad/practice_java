package ru.mirea.lab3.task5;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readNatural(sc);

        int[] numbers = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(n + 1);
        }

        System.out.println("Исходный массив:");
        print(numbers);

        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("Четных элементов нет");
            sc.close();
            return;
        }

        int[] even = new int[evenCount];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even[index] = numbers[i];
                index++;
            }
        }

        System.out.println("Четные элементы:");
        print(even);
        sc.close();
    }

    private static int readNatural(Scanner sc) {
        while (true) {
            System.out.print("Введите размер массива (натуральное число): ");
            if (!sc.hasNextInt()) {
                System.out.println("Нужно ввести целое число.");
                sc.next();
                continue;
            }
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Число должно быть больше 0.");
                continue;
            }
            return n;
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
