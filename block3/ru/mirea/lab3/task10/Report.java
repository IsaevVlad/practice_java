package ru.mirea.lab3.task10;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках");
        System.out.println("----------------------------------------------");
        System.out.printf("%-30s %14s%n", "Сотрудник", "Зарплата");
        System.out.println("----------------------------------------------");

        double total = 0;
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-30s %14.2f%n",
                    employees[i].getFullname(), employees[i].getSalary());
            total += employees[i].getSalary();
        }

        System.out.println("----------------------------------------------");
        System.out.printf("%-30s %14.2f%n", "Итого", total);
    }

    public static void main(String[] args) {
        Employee[] staff = {
                new Employee("Иванов Иван Иванович", 84500.5),
                new Employee("Петрова Анна Сергеевна", 120000),
                new Employee("Сидоров Пётр Алексеевич", 67340.25),
                new Employee("Кузнецова Мария Олеговна", 91500.7)
        };
        generateReport(staff);
    }
}
