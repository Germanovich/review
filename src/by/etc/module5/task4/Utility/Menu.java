package by.etc.module5.task4.Utility;

import by.etc.module5.task4.Item.DragonCave;
import by.etc.module5.task4.Item.Treasure;

import java.util.Scanner;

public class Menu {
    private static Scanner in = new Scanner(System.in);
    private Utils dragonCave = new Utils(new DragonCave());

    public void start() {

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - print all treasures");
            System.out.println("2 - print the most expensive treasure");
            System.out.println("3 - print treasures for a given sum");
            System.out.println("Another number - exit");
            int number = getValue();

            switch (number) {
                case (1): {

                    System.out.println("The treasures in the cave:");
                    dragonCave.printTreasures();
                    break;
                }
                case (2): {

                    Treasure treasure = dragonCave.getTheMostExpensiveTreasure();
                    System.out.println("The most expensive treasure is\n" + treasure);
                    break;
                }
                case (3): {

                    System.out.println("Enter the sum: ");
                    int sum = getValue();
                    int rest = dragonCave.findTreasuresForSum(sum);

                    System.out.println("Balance = " + rest + " gold");
                    break;
                }
                default: {
                    in.close();
                    break;
                }
            }
        }
    }

    private static int getValue() {

        while (!in.hasNextInt()) {
            in.next();
        }
        return in.nextInt();
    }
}
