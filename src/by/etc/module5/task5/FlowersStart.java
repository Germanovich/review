package by.etc.module5.task5;

import by.etc.module5.task5.utility.Menu;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * а) Корректно спроектируйте и реализуйте предметную область задачи.
 * б) Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
 * проектирования.
 * в) Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * г) Для проверки корректности переданных данных можно применять регулярные выражения.
 * д) Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * е) Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 *
 * Вариант А. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции (объект,
 * представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
 */

public class FlowersStart {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.start();
    }
}
