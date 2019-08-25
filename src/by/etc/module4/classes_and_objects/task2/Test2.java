package by.etc.module4.classes_and_objects.task2;

class Test2 {
    int number1;
    int number2;

    Test2() {
        number1 = 0;
        number2 = 0;
    }

    Test2(int number1, int number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}
