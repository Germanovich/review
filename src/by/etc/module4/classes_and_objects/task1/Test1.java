package by.etc.module4.classes_and_objects.task1;

class Test1 {
    int number1;
    int number2;

    public void displayInfo() {
        System.out.printf("Number1: %d \tnumber2: %d\n", number1, number2);
    }

    public void dataChange(int number1, int number2) {

        this.number1 = number1;
        this.number2 = number2;
    }

    public int sumOfNumbers() {
        return this.number1 + this.number2;
    }

    public int maxNumber() {
        return Math.max(this.number1, this.number2);
    }
}
