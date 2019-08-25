package by.etc.module4.aggegation_and_composition.task2.components;

class Wheel {
    private double radius;

    Wheel() {
        this.radius = 15;
    }

    Wheel(double radius) {
        if (radius <= 12 || radius >= 19) {
            throw new IllegalArgumentException("Размер колеса должен быть от 12 до 19 дюймов");
        } else {
            this.radius = radius;
        }
    }

    double getRadius() {
        return this.radius;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Wheel)) {
            return false;
        }

        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.radius, radius) == 0;
    }
}
