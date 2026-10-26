package ru.mirea.lab2.task6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(3.1, 4.1, 5.1);

        printCircle("Первая окружность", c1);
        printCircle("Вторая окружность", c2);
        printComparison(c1, c2);

        c2.setR(4);
        System.out.println();
        System.out.println("Радиус второй окружности изменён на " + c2.getR());
        printCircle("Вторая окружность", c2);
        printComparison(c1, c2);
    }

    private static void printCircle(String title, Circle circle) {
        System.out.println(title + ": " + circle);
        System.out.printf("Площадь = %.4f%n", circle.getArea());
        System.out.printf("Длина окружности = %.4f%n", circle.getLength());
    }

    private static void printComparison(Circle a, Circle b) {
        int result = a.compare(b);
        if (result < 0) {
            System.out.println("Первая окружность меньше второй");
        } else if (result > 0) {
            System.out.println("Первая окружность больше второй");
        } else {
            System.out.println("Окружности равны по радиусу");
        }
    }
}
