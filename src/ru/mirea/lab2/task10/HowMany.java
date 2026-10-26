package ru.mirea.lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String line = sc.nextLine();

        int count = 0;
        if (!line.trim().isEmpty()) {
            count = line.trim().split("\\s+").length;
        }

        System.out.println("Количество слов: " + count);
        sc.close();
    }
}
