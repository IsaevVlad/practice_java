package ru.mirea.lab4.task6;

public class EmployerTest {
    public static void main(String[] args) {
        Employer asManager = new Manager("Олег", "Смирнов", 80000, 150000);
        System.out.println("Ссылка типа Employer указывает на Manager:");
        System.out.println(asManager);
        System.out.printf("getIncome() = %.2f%n", asManager.getIncome());

        Employer[] staff = {
                new Employer("Иван", "Петров", 50000),
                new Manager("Анна", "Кузнецова", 70000, 120000),
                new Employer("Мария", "Соколова", 62000),
                asManager
        };

        System.out.println();
        System.out.println("Доход сотрудников:");
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].getClass().getSimpleName() + ": " + staff[i]);
            System.out.printf("Годовой доход = %.2f%n", staff[i].getIncome());
        }
    }
}
