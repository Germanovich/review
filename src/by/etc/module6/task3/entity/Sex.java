package by.etc.module6.task3.entity;

public enum Sex {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
