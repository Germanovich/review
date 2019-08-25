package by.etc.module4.aggegation_and_composition.task4.components;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
    public int compare(Account o1, Account o2) {
        double Balance1 = o1.getBalance();
        double Balance2 = o2.getBalance();
        return (int) (Balance1 - Balance2);
    }
}
