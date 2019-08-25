package by.etc.module3.char_array.task1;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class CharArray1 {
    public static void main(String[] args) {
        char[][] textArray = new char[][]{
                {'h', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'},
                {'c', 'h', 'a', 'r', 'A', 'r', 'r', 'a', 'y'},
                {'d', 'o', 'c', 't', 'o', 'r', 'W', 'h', 'o'}
        };
        System.out.println("CamelCase: ");
        int i = 0;
        while (i < textArray.length) {
            for (int j = 0; j < textArray[i].length; j++) {
                System.out.print(textArray[i][j]);
            }
            System.out.println();
            i++;
        }

        for (i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {

                String str = new String(textArray[i]);
                str = str.replaceAll("([a-z])([A-Z])", "$1_$2");
                textArray[i] = str.toCharArray();

                if (textArray[i][j] >= 'A' && textArray[i][j] <= 'Z') {
                    int ascii = (int) textArray[i][j];
                    char myNew = (char) (ascii + 32); //изменяем на маленькую.
                    textArray[i][j] = myNew; //заменяем старую на новую
                }
            }
        }

        System.out.println("\nsnake_case: ");
        for (i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {
                System.out.print(textArray[i][j]);
            }
            System.out.println();
        }

    }

}
