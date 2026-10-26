package ru.mirea.lab4.task7;

public class Schoolchild extends Learner {
    private int grade;

    public Schoolchild(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String getKind() {
        return "Школьник";
    }

    @Override
    public String toString() {
        return super.toString() + ", " + grade + " класс";
    }
}
