package by.etc.module6.task1;

import by.etc.module6.task1.entity.book.Book;
import by.etc.module6.task1.entity.book.BookBuilder;
import by.etc.module6.task1.entity.book.Type;
import by.etc.module6.task1.entity.user.User;
import by.etc.module6.task1.utils.Library;
import by.etc.module6.task1.utils.Pagination;
import by.etc.module6.task1.utils.UserUtils;

import java.security.NoSuchAlgorithmException;

/**
 * Создать консольное приложение "Учет книг в домашней библиотеке".
 * Общие требования к заданию:
 * а) Система учитывает книги как в электронном, так и в бумажном варианте.
 * б) Существующие роли: пользователь, администратор.
 * в) Пользователь может просматривать книги в каталоге книг, осушествлять поиск книг в каталоге.
 * г) Администатор может модифицировать каталог.
 * д) *При добавлении описания книги в каталог оповещение о ней рассылается на e-mail всем пользователям.
 * е) **При просмотре каталога желательно реализовать постраничный просмотр.
 * ж) ***Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.
 * з) Каталог книг хранится в текстовом файле.
 * к) Данные аутентификации пользователей хранятся в текстовом файле. Пароль не хранится в открытом виде.
 */

public class Task1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        Library library = Library.getLibrary("admin", "admin");

        Pagination<Book> libraryBooks = new Pagination<>(library.getBooks());
        libraryBooks.nextPage();
        System.out.println("________________________________________");
        libraryBooks.nextPage();
        System.out.println("________________________________________");
        libraryBooks.previousPage();

        Book book = new BookBuilder().withTitle("Gone With the Wind")
                .withAuthor("Margaret Mitchell")
                .setPublisher("World")
                .setYear(1986)
                .setPageNum(624)
                .setType(Type.E_BOOK)
                .build();

        library.addBook(book);

        User user = new User("guest", "user0");

        library.setUser(user);

        System.out.println("//////////////////////////////Sort by author//////////////////////////////");
        Pagination<Book> searchBooks1 = new Pagination<>(library.findBooksByAuthor("Lev Tolstoy"));
        searchBooks1.nextPage();

        System.out.println("//////////////////////////////Sort by title//////////////////////////////");
        Pagination<Book> searchBooks2 = new Pagination<>(library.findBooksByTitle("Demons"));
        searchBooks2.nextPage();

        System.out.println("/////////////////////////////////////////////////////////////////////////");

        Book book2 = new BookBuilder().withTitle("Java")
                .withAuthor("Bruce Eckel")
                .setPublisher("Marc")
                .setYear(2019)
                .setPageNum(1168)
                .setType(Type.E_BOOK)
                .build();

        library.sendBookToCatalog("Add book", "This useful book", book2);
        library.getUser().getEmail().printInbox();
        library.getUser().getEmail().printOutbox();

        libraryBooks.previousPage();
        libraryBooks.nextPage();

        UserUtils.addUser("guest2", "guest2");

    }
}
