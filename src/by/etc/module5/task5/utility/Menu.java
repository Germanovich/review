package by.etc.module5.task5.utility;

import by.etc.module5.task5.components.Bouquet;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    private static Scanner in = new Scanner(System.in);

    public void start() {
      System.out.println("Enter the name of flower composition:");
      String name = getName();
      System.out.println("Choose flower kind (natural or artificial):");
      String typeFlower = getTypeFlower();

      System.out.println("Enter the number of flowers you want:");
      int numberOfFlowers  = checkValue();
      System.out.println("Enter the number of warps you want:");
      int numberOfWraps  = checkValue();

      Bouquet bouquet = new BouquetBuilder()
              .setname(name)
              .setTypeFlower(typeFlower)
              .setNumberOfFlowers(numberOfFlowers)
              .setNumberOfWraps(numberOfWraps)
              .buildBouquet();
      BouquetUtility bouquetUtils = new BouquetUtility(bouquet);
      bouquetUtils.printBouquet();

    }
    private String getName(){
        Pattern pattern = Pattern.compile("[\\w ].*");
        in.useDelimiter("[\r\n]");
        while(!in.hasNext(pattern)) {
            in.nextLine();
            System.out.println("Enter again:");
        }
        return  in.nextLine();
    }
    private String getTypeFlower() {
        Pattern pattern = Pattern.compile("(natural)|(artificial)");
        while (!in.hasNext(pattern)) {
            in.nextLine();
            System.out.println("Enter \"natural\" or \"artificial\":");
        }

        return in.nextLine();
    }
    private static int getValue() {
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Enter again:");
        }

        return in.nextInt();
    }
    private static int checkValue() {

        int value;

        while (true) {
            value = getValue();

            if (value > 0) {
                break;
            }
            else {
                System.out.println("Error. Enter again: ");
            }
        }

        return value;
    }
}
