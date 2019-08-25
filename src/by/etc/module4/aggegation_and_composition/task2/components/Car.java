package by.etc.module4.aggegation_and_composition.task2.components;

public class Car {

    private String carName;
    private String carModel;
    private int maxFuel;
    private int fuel;

    private Engine engine = new Engine(5);

    private Wheel fourWheel = new Wheel(14);

    Car() {
        this.carName = "Неопределено";
        this.carModel = "Неопределено";
        this.maxFuel = 0;
        this.fuel = 0;
    }

    public Car(String name, int fuel, int tank, String carModel) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("У машины должна быть название");
        } else {
            this.carName = name;
        }
        if (carModel == null || carModel.equals("")) {
            throw new IllegalArgumentException("У машины должна быть марка");
        } else {
            this.carModel = carModel;
        }
        if (fuel < 0)
            throw new IllegalArgumentException("Ёмкость бака не может быть отрецательной");
        else {
            this.maxFuel = tank;
        }
        this.fuel = fuel;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void ride() {
        if (this.fuel == 0)
            System.out.println("Ехать не возможно, бак пуст");
        else if (!engine.hasStarted()) {
            System.out.println("Дигатель не заведён");
        } else {
            System.out.println("Едем, ..., ...");
            isRide();
        }
    }

    private void isRide() {
        for (int i = this.fuel; i > 0; i -= this.engine.getExpense()) {
            if (this.fuel - this.engine.getExpense() < 0) {
                this.engine.stopEngine();
                break;
            } else {
                this.fuel = this.fuel - this.engine.getExpense();
                this.engine.increase();
            }
        }
        this.engine.stopEngine();
        System.out.println("На исходе бензин.");
    }

    public void chargeFuel(int fuel) {
        int availability = this.maxFuel - (this.maxFuel - this.fuel);
        if (this.maxFuel <= 0)
            System.out.println("Не задана ёмкость бака");
        else if ((this.maxFuel - this.fuel) < fuel) {
            System.out.println("Бак на " + this.maxFuel + " л., в него не влезет " + fuel + " литров");
            System.out.println("Бак не пуст. Остаток " + availability + " литров");
        } else if (availability + fuel == this.maxFuel) {
            System.out.println("Машина успешно заправлена на " + fuel + " литров");
            this.fuel = fuel;
        } else {
            this.fuel = fuel;
            System.out.println("Машина заправлена на " + fuel + " литров");
        }
    }

    public void changeWheel(double radius) {
        if (this.engine.hasStarted()) {
            System.out.println("Остановите двигатель перед заменой колес");
        } else {
            this.fourWheel = new Wheel(radius);
            System.out.println("Колёса заменены");
        }
    }

    public void startEngine() {
        if (this.fuel != 0)
            this.engine.startEngine();
        else
            System.out.println("Машину не завести, бак пуст");
    }

    public int getMileage() {
        return this.engine.getMileage();
    }

    public String toString() {
        return "\nCar:" + "\nCar name = \"" + carName + '\"' + "\nCar model = " + getCarModel() +
                "\nMax fuel = " + maxFuel + "\nFuel = " + fuel + "\nEngine expense = " + engine.getExpense() +
                "\nEngine mileage = " + engine.getMileage() + "\nWheel radius = " + this.fourWheel.getRadius();
    }
}
