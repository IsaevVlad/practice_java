package ru.mirea.lab2.task7;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Булгаков", "Мастер и Маргарита", 1967);
        System.out.println("Книга: " + book);
        book.setYear(1940);
        System.out.println("После изменения года: " + book.getAuthor()
                + ", " + book.getTitle() + ", " + book.getYear());

        Bookshelf shelf = new Bookshelf(5);
        shelf.addBook(new Book("Толкин", "Властелин колец", 1954));
        shelf.addBook(new Book("Оруэлл", "1984", 1949));
        shelf.addBook(book);
        shelf.addBook(new Book("Пушкин", "Евгений Онегин", 1833));
        shelf.addBook(new Book("Достоевский", "Преступление и наказание", 1866));

        System.out.println();
        System.out.println("Книги на полке (" + shelf.getCount() + "):");
        shelf.printBooks();
        System.out.println("Самая ранняя: " + shelf.getEarliest());
        System.out.println("Самая поздняя: " + shelf.getLatest());

        shelf.sortByYear();
        System.out.println();
        System.out.println("После сортировки по году:");
        shelf.printBooks();
    }
}
