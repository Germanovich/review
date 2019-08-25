package by.etc.module5.task5.components.Type;

public enum FlowerType {
    HYDRANGEA("Hydrangea"),
    SAKURA("Sakura"),
    TULIP("Tulip"),
    ROSE("Rose");

    private String name;

    FlowerType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
