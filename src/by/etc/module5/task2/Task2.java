package by.etc.module5.task2;

import by.etc.module5.task2.cashbox.Client;
import by.etc.module5.task2.cashbox.Payment;
import by.etc.module5.task2.cashbox.Product;
import by.etc.module5.task2.cashbox.Shop;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких
 * товаров.
 */

public class Task2 {
    public static void main(String[] args) {

        Shop shop = new Shop("Shop #1");

        Client client = new Client("Harry", "Johnson");

        Product product1 = new Product("Honey", 15.36);
        Product product2 = new Product("Cheese", 9.99);
        Product product3 = new Product("Chocolate", 5.55);
        Product product4 = new Product("Sausage", 21.99);
        Product product5 = new Product("eggs", 2.21);

        shop.addClient(client);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);

        Payment payment = new Payment(client);

        payment.addProduct(product1);
        payment.addProduct(product2);

        payment.makePayment();
    }
}

