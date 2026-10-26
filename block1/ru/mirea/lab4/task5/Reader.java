package ru.mirea.lab4.task5;

public class Reader {
    private String fullName;
    private String cardNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fullName, String cardNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " " + booksWord(count));
    }

    public void takeBook(String... titles) {
        System.out.println(fullName + " взял книги: " + join(titles));
    }

    public void takeBook(Book... books) {
        System.out.println(fullName + " взял книги: " + join(namesOf(books)));
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " " + booksWord(count));
    }

    public void returnBook(String... titles) {
        System.out.println(fullName + " вернул книги: " + join(titles));
    }

    public void returnBook(Book... books) {
        System.out.println(fullName + " вернул книги: " + join(namesOf(books)));
    }

    private String[] namesOf(Book[] books) {
        String[] names = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            names[i] = books[i].getName();
        }
        return names;
    }

    private String join(String[] parts) {
        String result = "";
        for (int i = 0; i < parts.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += parts[i];
        }
        return result;
    }

    private String booksWord(int count) {
        int lastTwo = count % 100;
        int last = count % 10;
        if (lastTwo >= 11 && lastTwo <= 14) {
            return "книг";
        }
        if (last == 1) {
            return "книгу";
        }
        if (last >= 2 && last <= 4) {
            return "книги";
        }
        return "книг";
    }

    @Override
    public String toString() {
        return fullName + ", билет " + cardNumber
                + ", факультет " + faculty
                + ", дата рождения " + birthDate
                + ", телефон " + phone;
    }
}
