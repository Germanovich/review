package by.etc.module1.cycle_program.task4;

import java.util.Scanner;
import java.math.BigDecimal;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class CycleProgram4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Initial number: ");
        BigDecimal number = in.nextBigDecimal();
        in.close();

        BigDecimal pow;
        BigDecimal result = BigDecimal.valueOf(1);
        BigDecimal copy = BigDecimal.valueOf(1);
        double end = 200;
        double copy2 = copy.doubleValue();
        double number2 = number.doubleValue();

        while (number2 <= end) {
            pow = number.multiply(number);
            result = result.multiply(pow);
            number = number.add(copy);
            number2 += copy2;
        }
        System.out.println("Result: " + result);
    }
}
