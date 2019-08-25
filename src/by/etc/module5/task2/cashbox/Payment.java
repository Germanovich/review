package by.etc.module5.task2.cashbox;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private static int genId = 1;
    private int id;
    private Client client;
    private moneyAccount moneyAccount;

    public Payment(Client client) {
        this.id = genId++;
        this.client = client;
        this.moneyAccount = new moneyAccount();
    }

    private class moneyAccount {

        private List<Product> product;

        private moneyAccount() {
            setProduct(new ArrayList<>());
        }

        public void setProduct(List<Product> product) {
            this.product = product;
        }

        private List<Product> getProducts() {
            return product;
        }

        private double getTotalPrice() {
            double sum = 0;
            for (Product product : product) {
                sum += product.getPrice();
            }
            return sum;
        }
    }

    public boolean addProduct(Product product) {
        System.out.println(product.toString());
        return moneyAccount.getProducts().add(product);
    }

    public void makePayment() {
        if (!moneyAccount.getProducts().isEmpty()) {
            System.out.println("№" + id + " " + client.getName() + " " + client.getSurname() + " bought " +
                    moneyAccount.getTotalPrice() + "$ worth of groceries");
        }
        else {
            System.out.println("The moneyAccount is empty!");
        }
    }
}
