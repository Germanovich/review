package by.etc.module5.task4.Item.Type;

public enum WeaponType {
    SWORD("Sword"), CARBINE("Carbine"), CLUB("Club"), BOW("Bow"), AXE("Axe"),
    BAT("Bat"), STAFF("Staff"), CHAKRAM("Chakram");

    private String name;

    WeaponType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
