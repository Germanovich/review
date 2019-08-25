package by.etc.module4.aggegation_and_composition.task2.components;

class Engine {

    private int mileage = 0;
    private boolean hasStarted = false;
    private int expense;

    Engine(int expense) {
        this.expense = expense;
    }

    void startEngine() {
        this.hasStarted = true;
        System.out.println("Двигатель заведён");
    }

    void stopEngine() {
        this.hasStarted = false;
    }

    boolean hasStarted() {
        return this.hasStarted;
    }

    int getExpense() {
        return this.expense;
    }

    int getMileage() {
        return this.mileage;
    }

    void increase() {
        this.mileage++;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;

        Engine engine = (Engine) o;

        if (expense != engine.expense) {
            return false;
        }
        if (hasStarted != engine.hasStarted) {
            return false;
        }
        if (mileage != engine.mileage) {
            return false;
        }

        return true;
    }
}
