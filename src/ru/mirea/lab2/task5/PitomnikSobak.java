package ru.mirea.lab2.task5;

public class PitomnikSobak {
    private Dog[] dogs;
    private int count;

    public PitomnikSobak(int capacity) {
        dogs = new Dog[capacity];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count >= dogs.length) {
            System.out.println("Питомник заполнен, нельзя добавить: " + dog.getName());
            return;
        }
        dogs[count] = dog;
        count++;
    }

    public void printDogs() {
        if (count == 0) {
            System.out.println("В питомнике нет собак");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(dogs[i]);
        }
    }

    public static void main(String[] args) {
        PitomnikSobak kennel = new PitomnikSobak(5);

        kennel.addDog(new Dog("Бобик", 3));
        kennel.addDog(new Dog("Шарик", 5));
        kennel.addDog(new Dog("Рекс", 2));
        kennel.addDog(new Dog("Мухтар", 7));

        System.out.println("Собаки в питомнике:");
        kennel.printDogs();
    }
}
