package by.etc.module4.classes_and_objects.task8;

class Customer {

    private static int idGenerator = 1;
    private int id = idGenerator++;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int creditCardId;
    private int bankCard;

    Customer(String surname, String name, String patronymic, String address, int creditCardId, int bankCard) {
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setAddress(address);
        setCreditCardId(creditCardId);
        setBankCard(bankCard);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setCreditCardId(int creditCardId) {
        this.creditCardId = creditCardId;
    }

    private void setBankCard(int bankCard) {
        this.bankCard = bankCard;
    }

    private String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    private String getPatronymic() {
        return patronymic;
    }

    private String getAddress() {
        return address;
    }

    int getCreditCardId() {
        return creditCardId;
    }

    private int getBankCard() {
        return bankCard;
    }

    public String toString() {
        return String.format("ID: %d\t surname: %s\t\t name: %-10s  patronymic: %-15s from: %-10s" +
                        "credit card: %-10d bank number %d", id, getSurname(), getName(), getPatronymic(), getAddress(),
                getCreditCardId(), getBankCard());
    }

}