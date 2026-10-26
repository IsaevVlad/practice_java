package ru.mirea.lab3.task8;

import java.util.Scanner;

public class Converter {
    private final double rubPerUsd;
    private final double rubPerEur;
    private final double rubPerCny;

    public Converter(double rubPerUsd, double rubPerEur, double rubPerCny) {
        this.rubPerUsd = rubPerUsd;
        this.rubPerEur = rubPerEur;
        this.rubPerCny = rubPerCny;
    }

    public double convert(double amount, String from, String to) {
        return amount * rate(from) / rate(to);
    }

    public void printRates() {
        System.out.println("Курсы к рублю:");
        System.out.printf("1 USD = %8.2f RUB%n", rubPerUsd);
        System.out.printf("1 EUR = %8.2f RUB%n", rubPerEur);
        System.out.printf("1 CNY = %8.2f RUB%n", rubPerCny);
    }

    private double rate(String code) {
        switch (code) {
            case "RUB":
                return 1;
            case "USD":
                return rubPerUsd;
            case "EUR":
                return rubPerEur;
            case "CNY":
                return rubPerCny;
            default:
                throw new IllegalArgumentException("Неизвестная валюта: " + code);
        }
    }

    public static void main(String[] args) {
        Converter converter = new Converter(92.50, 100.00, 12.80);
        converter.printRates();
        System.out.println();
        System.out.println("Примеры:");
        printResult(converter, 10, "USD", "RUB");
        printResult(converter, 25.5, "EUR", "USD");

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Сумма: ");
        double amount = readAmount(sc);
        String from = readCurrency(sc, "Из валюты (RUB, USD, EUR, CNY): ");
        String to = readCurrency(sc, "В валюту (RUB, USD, EUR, CNY): ");
        printResult(converter, amount, from, to);
        sc.close();
    }

    private static void printResult(Converter converter, double amount, String from, String to) {
        double result = converter.convert(amount, from, to);
        System.out.printf("%10.2f %s = %10.2f %s%n", amount, from, result, to);
    }

    private static double readAmount(Scanner sc) {
        while (true) {
            if (!sc.hasNextDouble()) {
                System.out.println("Нужно ввести число.");
                sc.next();
                System.out.print("Сумма: ");
                continue;
            }
            double amount = sc.nextDouble();
            if (amount < 0) {
                System.out.println("Сумма не может быть отрицательной.");
                System.out.print("Сумма: ");
                continue;
            }
            return amount;
        }
    }

    private static String readCurrency(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String code = sc.next().trim().toUpperCase();
            if (code.equals("RUB") || code.equals("USD") || code.equals("EUR") || code.equals("CNY")) {
                return code;
            }
            System.out.println("Такой валюты нет. Доступны RUB, USD, EUR, CNY.");
        }
    }
}
