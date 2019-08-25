package by.etc.module6.task1.entity;

import by.etc.module6.task1.entity.book.Book;
import by.etc.module6.task1.entity.user.Email;
import by.etc.module6.task1.utils.Operation;

public interface CatalogObserver {

    void update(Operation operation, Book book, Email email);
}