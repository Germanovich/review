package by.etc.module6.task1.utils;

import by.etc.module6.task1.entity.book.Book;
import by.etc.module6.task1.entity.book.BookBuilder;
import by.etc.module6.task1.entity.book.Type;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CatalogFileHandler {

    private static String csvFile = "C:\\Users\\Пользователь\\IdeaProjects\\untitled3\\" +
            "src\\by\\etc\\module6\\task1\\data\\catalog.csv";

    public static List<Book> loadBooks() {

        String line;

        List<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Book book = new BookBuilder().withTitle(data[0])
                        .withAuthor(data[1])
                        .setPublisher(data[2])
                        .setYear(Integer.valueOf(data[3]))
                        .setPageNum(Integer.valueOf(data[4]))
                        .setType(Type.valueOf(data[5].toUpperCase()))
                        .build();

                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }

    public static void saveCatalog(List<Book> books) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (Book book : books) {
                String text = book.getTitle() + "," +
                        book.getAuthor() + "," +
                        book.getPublisher() + "," +
                        book.getYear() + "," +
                        book.getPageNum() + "," +
                        book.getType().name().toLowerCase();
                bw.write(text);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}