package ru.mirea.lab2.task9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"
        };
        String[] suits = {"пик", "червей", "бубен", "треф"};

        String[] deck = new String[ranks.length * suits.length];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " " + suits[i];
                index++;
            }
        }

        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = random.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        int maxPlayers = deck.length / 5;
        if (n < 1 || n > maxPlayers) {
            System.out.println("Некорректное число игроков. Допустимо от 1 до " + maxPlayers);
            sc.close();
            return;
        }

        int card = 0;
        for (int player = 1; player <= n; player++) {
            for (int c = 0; c < 5; c++) {
                System.out.println(deck[card]);
                card++;
            }
            System.out.println();
        }

        sc.close();
    }
}
