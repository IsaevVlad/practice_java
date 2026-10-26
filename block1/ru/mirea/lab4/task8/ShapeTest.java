package ru.mirea.lab4.task8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(2, 4, "синий", false),
                new Square(3, "зелёный", true)
        };

        for (int i = 0; i < shapes.length; i++) {
            print(shapes[i]);
        }

        Square square = new Square(3);
        System.out.println("До изменения стороны: " + square);
        square.setWidth(6);
        System.out.println("После setWidth(6): сторона = " + square.getSide()
                + ", ширина = " + square.getWidth()
                + ", длина = " + square.getLength());
    }

    private static void print(Shape shape) {
        System.out.println(shape);
        System.out.println("Цвет: " + shape.getColor() + ", заливка: " + shape.isFilled());
        System.out.printf("Площадь = %.2f%n", shape.getArea());
        System.out.printf("Периметр = %.2f%n", shape.getPerimeter());
        System.out.println();
    }
}
