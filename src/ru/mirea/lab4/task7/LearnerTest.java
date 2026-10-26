package ru.mirea.lab4.task7;

public class LearnerTest {
    public static void main(String[] args) {
        Learner[] people = {
                new Schoolchild("Иван Петров", 7),
                new Student("Мария Соколова", "ИВБО-01-24"),
                new Schoolchild("Алексей Смирнов", 10),
                new Student("Ольга Кузнецова", "ИКБО-02-23"),
                new Schoolchild("Пётр Орлов", 4)
        };

        System.out.println("Все учащиеся:");
        print(people);

        System.out.println();
        System.out.println("Школьники:");
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Schoolchild) {
                System.out.println(people[i]);
            }
        }

        System.out.println();
        System.out.println("Студенты:");
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Student) {
                System.out.println(people[i]);
            }
        }
    }

    private static void print(Learner[] people) {
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
