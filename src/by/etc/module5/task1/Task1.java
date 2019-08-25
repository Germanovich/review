package by.etc.module5.task1;

import by.etc.module5.task1.File.File;
import by.etc.module5.task1.File.PathToTheFile;
import by.etc.module5.task1.File.TextFile;
import by.etc.module5.task1.utility.Utility;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести
 * на консоль содержимое, дополнить, удалить.
 */

public class Task1 {
    public static void main(String[] args) {

        Utility utility = new Utility(new PathToTheFile("D:\\work\\"));

        File book1 = new TextFile("Cash");
        File book2 = new TextFile("Clients");
        File book3 = new TextFile("Product");
        File book4 = new TextFile("Shops");

        utility.addFile(book1);
        utility.addFile(book2);
        utility.addFile(book3);
        utility.addFile(book4);

        utility.printFiles();
        System.out.println(utility.getName() + book1.getName());
        System.out.print("Found " + book1.getName() + ": ");
        book1.checkFile();

        book1.printText();

        book1.addText("Hello");
        book1.addText("World");

        book1.printText();
        utility.deleteFile(book4);
        utility.printFiles();
    }
}

