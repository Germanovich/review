package by.etc.module4.aggegation_and_composition.task4.components;

public class Account {
    private int id;
    private double balance;
    private boolean block;

    public Account(int id, double balance) {
        setId(id);
        setBalance(balance);
        this.block = balance < 0;
    }

    int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    boolean block() {
        return block;
    }

    public String toString() {
        return "\n\tAccount: " + "id = " + getId() + ", balance = " + getBalance() + ", block = " + block();
    }
}
