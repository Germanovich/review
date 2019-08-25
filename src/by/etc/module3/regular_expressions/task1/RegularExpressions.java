package by.etc.module3.regular_expressions.task1;

import java.util.Scanner;

/**
 * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнить с текстом три различных
 * операции: отсортировать обзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства - по
 * алфавиту.
 */

public class RegularExpressions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = " Every day in elementary school in America begins at 9:20 am. " +
                "Children have classes till 3:15 pm. " +
                "At 12 o’clock children have lunch. " +
                "Many boys and girls bring their lunch from home. " +
                "But some of them go for lunch to a school cafeteria.\n " +
                "Bradley prepares school lunches almost every weekday for her two children. " +
                "Sometimes she gives the children money and they eat in the school cafeteria. " +
                "But usually the children prefer to take a lunch from home.\n " +
                "This morning Bradley is making peanut butter and cheese sandwiches, the children's favorite. " +
                "She puts two bottles of apple juice for the children to drink. " +
                "She is going to put the sandwiches, some cherry tomatoes and two bananas in their lunchboxes. " +
                "The lunchbox is easy for the children to carry to school.";
        boolean cont = true;
        while (cont == true) {

            System.out.println("============================");
            System.out.println("|           MENU           |");
            System.out.println("============================");
            System.out.println("|    1. Sort paragraphs    |");
            System.out.println("|     2. Sort lexemes      |");
            System.out.println("|      3. Sort words       |");
            System.out.println("============================");
            System.out.print("Select option: ");
            int number = in.nextInt();

            switch (number) {
                case 1: {
                    cont = false;
                    SortParagraphs class1 = new SortParagraphs();
                    class1.sortParagraphs(text);
                    break;
                }
                case 2: {
                    cont = false;
                    SortLexemes class2 = new SortLexemes();
                    class2.sortLexemes(text);
                    break;
                }
                case 3: {
                    cont = false;
                    SortWords class3 = new SortWords();
                    class3.sortText(text);
                    break;
                }
                default: {
                    cont = true;
                    System.out.println("number < 1 || number > 3");
                }
            }
        }
    }
}
