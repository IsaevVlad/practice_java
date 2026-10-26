package ru.mirea.lab3.task7;

public class Task7 {
    public static void main(String[] args) {
        String[] header = {
                "Метод", "Boolean", "Byte", "Character", "Double",
                "Float", "Integer", "Long", "Short", "static"
        };
        String[][] rows = {
                {"byteValue", "-", "x", "-", "x", "x", "x", "x", "x", "нет"},
                {"doubleValue", "-", "x", "-", "x", "x", "x", "x", "x", "нет"},
                {"floatValue", "-", "x", "-", "x", "x", "x", "x", "x", "нет"},
                {"intValue", "-", "x", "-", "x", "x", "x", "x", "x", "нет"},
                {"longValue", "-", "x", "-", "x", "x", "x", "x", "x", "нет"},
                {"shortValue", "-", "x", "-", "x", "x", "x", "x", "x", "нет"},
                {"parseXxx", "x", "x", "-", "x", "x", "x", "x", "x", "да"},
                {"parseXxx with radix", "-", "x", "-", "-", "-", "x", "x", "x", "да"},
                {"valueOf with radix", "-", "x", "-", "-", "-", "x", "x", "x", "да"},
                {"toString", "x", "x", "x", "x", "x", "x", "x", "x", "нет"},
                {"toString(primitive)", "x", "x", "x", "x", "x", "x", "x", "x", "да"},
                {"toString(primitive, radix)", "-", "-", "-", "-", "-", "x", "x", "-", "да"}
        };

        System.out.println("Таблица 3.2. Методы классов оболочек");
        System.out.println("x — метод есть, - — метода нет");
        System.out.println();
        printRow(header);
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < rows.length; i++) {
            printRow(rows[i]);
        }
    }

    private static void printRow(String[] cells) {
        System.out.printf("%-28s", cells[0]);
        for (int i = 1; i < cells.length; i++) {
            System.out.printf("%-12s", cells[i]);
        }
        System.out.println();
    }
}
