package by.etc.module6.task2.menu;

import by.etc.module6.task2.entity.Note;
import by.etc.module6.task2.logic.NotepadHandler;
import by.etc.module6.task2.logic.NotepadPrinter;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private NotepadHandler notepad = NotepadHandler.getInstance();

    public void run() {
        while (true) {
            printMenu();
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();

            switch (number) {
                case (1): {
                    notepad.addNote();
                    break;
                }
                case (2): {

                    NotepadPrinter.printNotes(notepad.getNotes());
                    break;
                }
                case (3): {

                    notepad.sortNotesByEmail();
                    break;
                }
                case (4): {

                    notepad.sortNotesByDate();
                    break;
                }
                case (5): {

                    List<Note> notesByEmail = notepad.getNotesByEmail();
                    NotepadPrinter.printNotes(notesByEmail);
                    break;
                }
                case (6): {

                    List<Note> notesAfterDate = notepad.getNotesAfterDate();
                    NotepadPrinter.printNotes(notesAfterDate);
                    break;
                }
                case (7): {

                    List<Note> notesByMessageWord = notepad.findNotesByMessageWord();
                    NotepadPrinter.printNotes(notesByMessageWord);
                    break;
                }
                default: {
                    notepad.saveNotepad();
                    in.close();
                    break;
                }
            }
        }
    }

    private void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1 - Add note");
        System.out.println("2 - Print all notes");
        System.out.println("3 - Sort notes by email");
        System.out.println("4 - Sort notes by date");
        System.out.println("5 - Get notes by email");
        System.out.println("6 - Get notes after date (dd/MM/yy)");
        System.out.println("7 - Find note by word in the message");
        System.out.println("Another number - Exit");
    }
}
