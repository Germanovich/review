package by.etc.module4.classes_and_objects.task2;

/**
 * Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
 * инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей класса.
 */

public class Class2 {
    public static void main(String[] args) {
        Test2 value1 = new Test2(5, 10);
        value1.setNumber1(5);
        value1.setNumber2(10);
        System.out.println(value1.getNumber1() + " " + value1.getNumber2());

        Test2 value2 = new Test2();
        System.out.println(value2.getNumber1() + " " + value2.getNumber2());
    }
}