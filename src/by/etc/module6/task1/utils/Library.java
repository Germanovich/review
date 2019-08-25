package by.etc.module6.task1.utils;

import by.etc.module6.task1.entity.Content;
import by.etc.module6.task1.entity.book.Book;
import by.etc.module6.task1.entity.user.Email;
import by.etc.module6.task1.entity.user.Letter;
import by.etc.module6.task1.entity.user.User;

import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private static Library INSTANCE;

    private List<Book> books;

    private User user;
    private Email systemEmail;

    private Library(String userName, String password) {
        this.user = UserUtils.login(userName, password);
        this.books = CatalogFileHandler.loadBooks();
        this.systemEmail = new Email("LibraryBy@gmail.com");
    }

    public static Library getLibrary(String username, String password) {
        if (INSTANCE == null) {
            INSTANCE = new Library(username, password);
        }
        return INSTANCE;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = UserUtils.login(user.getUserName(), new String(user.getPassword()));
    }

    public void sendBookToCatalog(String subject, String text, Content content) {
        for (User user : UserUtils.getUsers()) {
            if (UserUtils.isAdmin(user)) {
                Letter letter = new Letter(this.user.getEmail(), user.getEmail(), subject, text, content);
                this.user.getEmail().getOutbox().add(letter);
                user.getEmail().getInbox().add(letter);
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Email getSystemEmail() {
        return systemEmail;
    }

    public void setSystemEmail(Email systemEmail) {
        this.systemEmail = systemEmail;
    }

    public void addBook(Book book) {
        if (UserUtils.isAdmin(user) && !books.contains(book)) {
            books.add(book);
            CatalogFileHandler.saveCatalog(books);
            notifyObservers(Operation.ADDED, book, systemEmail);
        }
        else if (books.contains(book)) {
            System.out.println("The library has this book.");
        }
        else if (!UserUtils.isAdmin(user)) {
            System.out.println("You don't have enough rights.");
        }
    }

    public void removeBook(Book book) {
        if (UserUtils.isAdmin(user)) {
            books.remove(book);
            CatalogFileHandler.saveCatalog(books);
            notifyObservers(Operation.REMOVED, book, systemEmail);
        }
        else if (!books.contains(book)) {
            System.out.println("The library doesn't have this book.");
        }
        else if (!UserUtils.isAdmin(user)) {
            System.out.println("You don't have enough rights.");
        }
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    public List<Book> findBooksByTitle(String title) {

        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
    }

    private void notifyObservers(Operation operation, Book book, Email systemEmail) {
        for (User user : UserUtils.getUsers()) {
            if (!UserUtils.isAdmin(user)) {
                user.update(operation, book, systemEmail);
            }
        }
    }
}
