package ru.mirea.lab4.task7;

public class Student extends Learner {
    private String group;

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String getKind() {
        return "Студент";
    }

    @Override
    public String toString() {
        return super.toString() + ", группа " + group;
    }
}
