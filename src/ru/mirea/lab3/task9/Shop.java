package ru.mirea.lab3.task9;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    private static final double RUB_PER_USD = 92.50;
    private static final double RUB_PER_EUR = 100.00;
    private static final double RUB_PER_CNY = 12.80;

    public static void main(String[] args) {
        Product[] catalog = {
                new Product("Наушники", 1990),
                new Product("Клавиатура", 4500),
                new Product("Мышь", 1200.50)
        };

        System.out.println("Интернет-магазин");
        for (int i = 0; i < catalog.length; i++) {
            System.out.printf("%d. %-15s %10.2f RUB%n", i + 1, catalog[i].getName(), catalog[i].getPriceRub());
        }

        Scanner sc = new Scanner(System.in);
        int index = readChoice(sc, catalog.length);
        int quantity = readQuantity(sc);
        String currency = readCurrency(sc);

        Product product = catalog[index];
        double totalRub = product.getPriceRub() * quantity;
        double total = totalRub / rate(currency);

        System.out.println();
        System.out.println("Товар: " + product.getName());
        System.out.println("Количество: " + quantity);
        System.out.printf("Сумма в рублях: %.2f RUB%n", totalRub);
        System.out.printf("Курс: 1 %s = %.2f RUB%n", currency, rate(currency));
        System.out.println("К оплате: " + currencyFormat(currency).format(total));
        sc.close();
    }

    private static double rate(String currency) {
        switch (currency) {
            case "USD":
                return RUB_PER_USD;
            case "EUR":
                return RUB_PER_EUR;
            case "CNY":
                return RUB_PER_CNY;
            default:
                return 1;
        }
    }

    private static NumberFormat currencyFormat(String currency) {
        Locale locale;
        switch (currency) {
            case "USD":
                locale = Locale.US;
                break;
            case "EUR":
                locale = Locale.FRANCE;
                break;
            case "CNY":
                locale = Locale.CHINA;
                break;
            default:
                locale = Locale.forLanguageTag("ru-RU");
                break;
        }
        return NumberFormat.getCurrencyInstance(locale);
    }

    private static int readChoice(Scanner sc, int size) {
        while (true) {
            System.out.print("Номер товара: ");
            if (!sc.hasNextInt()) {
                System.out.println("Нужно ввести номер товара.");
                sc.next();
                continue;
            }
            int number = sc.nextInt();
            if (number < 1 || number > size) {
                System.out.println("Такого товара нет.");
                continue;
            }
            return number - 1;
        }
    }

    private static int readQuantity(Scanner sc) {
        while (true) {
            System.out.print("Количество: ");
            if (!sc.hasNextInt()) {
                System.out.println("Нужно ввести целое число.");
                sc.next();
                continue;
            }
            int quantity = sc.nextInt();
            if (quantity <= 0) {
                System.out.println("Количество должно быть больше 0.");
                continue;
            }
            return quantity;
        }
    }

    private static String readCurrency(Scanner sc) {
        while (true) {
            System.out.print("Валюта оплаты (RUB, USD, EUR, CNY): ");
            String currency = sc.next().trim().toUpperCase();
            if (currency.equals("RUB") || currency.equals("USD")
                    || currency.equals("EUR") || currency.equals("CNY")) {
                return currency;
            }
            System.out.println("Такой валюты нет.");
        }
    }
}
