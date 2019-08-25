package by.etc.module1.cycle_program.task6;

/**
 * Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера.
 */

public class CycleProgram6 {
    public static void main(String[] args) {

        int symbol = 33;
        char code;
        while (symbol <= 255) {
            code = (char) symbol;
            System.out.println("Character code  - " + code);
            symbol++;
        }

    }
}
