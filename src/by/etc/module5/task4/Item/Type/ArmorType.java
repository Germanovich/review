package by.etc.module5.task4.Item.Type;

public enum ArmorType {
    HELMET("Helmet"), BREASTPLATE("Breastplate"), SHIELD("Shield"), GLOVES("Gloves"),
    BOOTS("Boots");

    private String name;

    ArmorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}