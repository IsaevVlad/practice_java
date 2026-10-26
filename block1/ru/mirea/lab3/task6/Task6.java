package ru.mirea.lab3.task6;

public class Task6 {
    public static void main(String[] args) {
        Double fromNumber = Double.valueOf(3.14);
        Double fromString = Double.valueOf("2.71828");
        System.out.println("1. valueOf(double): " + fromNumber);
        System.out.println("   valueOf(String): " + fromString);

        String text = "10.5";
        double parsed = Double.parseDouble(text);
        System.out.println("2. parseDouble(\"" + text + "\") = " + parsed);

        Double value = Double.valueOf(15.75);
        byte asByte = value.byteValue();
        short asShort = value.shortValue();
        int asInt = value.intValue();
        long asLong = value.longValue();
        float asFloat = value.floatValue();
        double asDouble = value.doubleValue();

        System.out.println("3. Преобразование " + value + " к примитивам:");
        System.out.println("   byte = " + asByte);
        System.out.println("   short = " + asShort);
        System.out.println("   int = " + asInt);
        System.out.println("   long = " + asLong);
        System.out.println("   float = " + asFloat);
        System.out.println("   double = " + asDouble);

        System.out.println("4. Объект Double: " + value);

        String d = Double.toString(3.14);
        System.out.println("5. Double.toString(3.14) = \"" + d + "\"");
    }
}
