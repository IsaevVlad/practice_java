package ru.mirea.lab4.task5;

public class ReaderTest {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Петров В. В.", "1001", "ИИТ", "12.05.2003", "+7-900-111-22-33"),
                new Reader("Иванов И. И.", "1002", "ИБ", "03.11.2002", "+7-900-444-55-66"),
                new Reader("Сидоров А. П.", "1003", "РТ", "21.07.2004", "+7-900-777-88-99")
        };

        System.out.println("Читатели:");
        for (int i = 0; i < readers.length; i++) {
            System.out.println((i + 1) + ". " + readers[i]);
        }

        System.out.println();
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(
                new Book("Приключения", "А. Грин"),
                new Book("Словарь", "С. Ожегов"),
                new Book("Энциклопедия", "А. Прохоров")
        );

        System.out.println();
        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[1].returnBook(
                new Book("Приключения", "А. Грин"),
                new Book("Словарь", "С. Ожегов"),
                new Book("Энциклопедия", "А. Прохоров")
        );
    }
}
