package by.etc.module4.aggegation_and_composition.task4.components;

import java.util.Arrays;

public class Bank {
    private String name;
    private Client[] clients;

    public Bank(String name, Client[] clients) {
        setName(name);
        setClients(clients);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Client[] getClients() {
        return clients;
    }

    private void setClients(Client[] clients) {
        this.clients = clients;
    }

    public String toString() {
        return "Bank \"" + getName() + "\"\nClients:\n" + Arrays.toString(getClients());
    }
}
