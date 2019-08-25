package by.etc.module6.task2.logic;

import by.etc.module6.task2.entity.Note;

import java.util.List;

public class NotepadPrinter {
    public static void printNotes(List<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
    }

    public static void printCodeLineError(PrinterCode code) {
        switch (code) {
            case EMAIL:
                System.out.println("Use the next format xxxxx@xxx.xx");
                break;
            case DATE:
                System.out.println("Use the next format yy/MM/dd");
                break;
            case TEXT:
                System.out.println("Enter at least 4 letters");
                break;
            case WORD:
                System.out.println("Enter at least 1 letter");
                break;
            default:
                throw new IllegalArgumentException("There is no such code: " + code);
        }

    }

    public static void printCodeLineHelper(PrinterCode code) {
        System.out.println("Enter " + code.name().toLowerCase() + " value:");
    }
}
