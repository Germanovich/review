package by.etc.module6.task2;

import by.etc.module6.task2.menu.Menu;

/**
 * Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. Каждая заметка это:
 * Заметка(тема, дата создания, email, сообщение).
 *
 * Общие пояснения к практическому заданию.
 * 1. В начале работы приложения данные должны считаться из файла, в конце работы - сохраняться в файл.
 * 2. У пользователя должна быть возможность найти запись по любому параметру или группе параметров (группу параметров
 * можно определить самостоятельно), получить требуемые записи в отсортированном виде, найти записи, текстовое поле
 * которой содержит определенное слово, а также добавить новую запись.
 * 3. Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных
 * выражений.
 * 4. Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий
 * информацию.
 */

public class Task2 {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }
}
