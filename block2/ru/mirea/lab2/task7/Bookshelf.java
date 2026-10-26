package ru.mirea.lab2.task7;

public class Bookshelf {
    private Book[] books;
    private int count;

    public Bookshelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("На полке нет места для книги: " + book.getTitle());
            return;
        }
        books[count] = book;
        count++;
    }

    public int getCount() {
        return count;
    }

    public Book getEarliest() {
        if (count == 0) {
            return null;
        }
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return earliest;
    }

    public Book getLatest() {
        if (count == 0) {
            return null;
        }
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest;
    }

    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public void printBooks() {
        if (count == 0) {
            System.out.println("Полка пуста");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}
