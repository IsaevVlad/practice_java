package ru.mirea.lab2.task8;

public class Task8 {
    public static void reverse(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] words = {"яблоко", "груша", "слива", "вишня", "персик"};

        System.out.println("До:");
        print(words);
        reverse(words);
        System.out.println("После:");
        print(words);
    }

    private static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
