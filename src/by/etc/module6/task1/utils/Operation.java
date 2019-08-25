package by.etc.module6.task1.utils;

public enum Operation {
    ADDED,
    REMOVED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
