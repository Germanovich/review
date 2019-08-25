package by.etc.module6.task1.entity.book;

import by.etc.module6.task1.entity.Content;
import java.util.Objects;

public class Book implements Content {

    private static int idGenerator = 1;
    private int id = idGenerator++;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pageNum;
    private Type type;

    public Book() {
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.year = 0;
        this.pageNum = 0;
        this.type = Type.PAPER;
    }

    public Book(String title, String author, String publisher, int year, int pageNum, Type type) {
        this();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageNum = pageNum;
        this.type = type;
    }

    public int getId() { return id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        if (year != book.year) {
            return false;
        }
        if (pageNum != book.pageNum) {
            return false;
        }
        if (!Objects.equals(title, book.title)) {
            return false;
        }
        if (!Objects.equals(author, book.author)) {
            return false;
        }
        if (!Objects.equals(publisher, book.publisher)) {
            return false;
        }
        return type == book.type;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + author.hashCode();
        assert publisher != null;
        result = 31 * result;
        result = 31 * result + year;
        result = 31 * result + pageNum;
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("id: %-4d title: %-35s authors: %-20s publisher: %-8s year: %-5d pageNum: %-5d format: %s",
                id, title, author, publisher, year, pageNum, type.name().toLowerCase());
    }
}
