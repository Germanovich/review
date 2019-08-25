package by.etc.module4.classes_and_objects.task3;

class Student {
    String surname;
    String initials;
    int groupNumber;
    int[] marks = new int[5];

    public Student(String surname, String initials, int groupNumber, int[] marks) {
        this.surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
        this.initials = initials.toUpperCase().trim();
        this.groupNumber = groupNumber;
        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }
}