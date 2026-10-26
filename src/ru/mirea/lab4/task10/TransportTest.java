package ru.mirea.lab4.task10;

public class TransportTest {
    public static void main(String[] args) {
        double distanceKm = 700;
        int passengers = 20;
        double cargoTons = 5;

        Vehicle[] fleet = {
                new Car(),
                new Plane(),
                new Train(),
                new Ship()
        };

        System.out.printf("Маршрут: %.0f км, пассажиров: %d, груз: %.1f т%n%n",
                distanceKm, passengers, cargoTons);
        System.out.printf("%-14s %12s %16s%n", "Транспорт", "Время, ч", "Стоимость, руб.");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < fleet.length; i++) {
            Vehicle vehicle = fleet[i];
            System.out.printf("%-14s %12.2f %16.2f%n",
                    vehicle.getName(),
                    vehicle.travelTimeHours(distanceKm),
                    vehicle.cost(distanceKm, passengers, cargoTons));
        }
    }
}
