package ru.mirea.lab4.task9;

public class FurnitureShop {
    private Furniture[] items;
    private int count;

    public FurnitureShop(int capacity) {
        items = new Furniture[capacity];
        count = 0;
    }

    public void add(Furniture item) {
        if (count >= items.length) {
            System.out.println("В магазине нет места для: " + item.getName());
            return;
        }
        items[count] = item;
        count++;
    }

    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public void printCatalog() {
        if (count == 0) {
            System.out.println("Магазин пуст");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);
        shop.add(new Chair("Офисный", 4500, "металл"));
        shop.add(new Table("Обеденный", 18000, "дуб"));
        shop.add(new Sofa("Угловой", 42000, "ткань"));
        shop.add(new Wardrobe("Двухстворчатый", 25000, "ЛДСП"));

        System.out.println("Каталог:");
        shop.printCatalog();
        System.out.printf("Сумма товаров: %.2f руб.%n", shop.totalPrice());
    }
}
