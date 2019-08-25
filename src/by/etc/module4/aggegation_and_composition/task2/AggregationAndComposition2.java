package by.etc.module4.aggegation_and_composition.task2;

import by.etc.module4.aggegation_and_composition.task2.components.Car;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.
 */

public class AggregationAndComposition2 {
    public static void main(String[] args) {
        Car vehicle = new Car("BMW", 15, 120, "7-Series");
        System.out.println("Модель: " + vehicle.getCarModel());
        vehicle.ride();
        System.out.println("Количество топлива " + vehicle.getFuel() + " литров.");
        vehicle.chargeFuel(120);
        vehicle.changeWheel(15);
        vehicle.ride();
        vehicle.startEngine();
        vehicle.changeWheel(21);
        vehicle.ride();
        System.out.println("Пробег составляет " + vehicle.getMileage() + " км.");
        System.out.println("Осталось топлива " + vehicle.getFuel() + " литров.");
        vehicle.chargeFuel(120);
        vehicle.ride();
        vehicle.startEngine();
        vehicle.ride();
        vehicle.chargeFuel(66);
        System.out.println("Пробег - " + vehicle.getMileage() + " км.");
        System.out.println("Осталось топлива " + vehicle.getFuel() + " литров.");

        System.out.println(vehicle.toString());
    }
}