package by.etc.module5.task5.components.Type;

public enum WrapType {
    PAPER("Paper"),
    CLOTH("Cloth"),
    RIBBON("Ribbon");

    private String name;

    WrapType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}