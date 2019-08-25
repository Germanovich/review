package by.etc.module6.task2.logic;

import by.etc.module6.task2.comparator.DateComparator;
import by.etc.module6.task2.comparator.EmailComparator;
import by.etc.module6.task2.entity.Note;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotepadHandler {
    private static NotepadHandler instance;
    private List<Note> notes;
    private Scanner in;

    private NotepadHandler(){
        this.notes = NotepadFileHandler.getInstance().loadNotes();
        this.in = new Scanner(System.in);
        in.useDelimiter("[\r\n]");
    }

    public static NotepadHandler getInstance(){
        if(instance == null){
            return new NotepadHandler();
        }
        else {
            return instance;
        }
    }

    public List<Note> getNotes(){
        return notes;
    }

    public void addNote(){
        String subject = getText();
        LocalDate date = LocalDate.now();
        String email = getEmail();
        String message = getText();

        Note note = new Note(subject, date, email, message);
        notes.add(note);
    }
    public void sortNotesByEmail(){
        notes.sort(new EmailComparator());
    }
    public void sortNotesByDate(){
        notes.sort(new DateComparator());
    }

    public List<Note> getNotesByEmail(){
        List<Note> notesByEmail = new ArrayList<>();
        String email = getEmail();
        for(Note note : notes){
            if(!note.getEmail().isEmpty() && note.getEmail().equals(email)){
                notesByEmail.add(note);
            }
        }
        return notesByEmail;
    }
    public List<Note> getNotesAfterDate() {
        List<Note> notesAfterDate = new ArrayList<>();

        LocalDate date = getDate();

        notes.stream().filter(note -> note.getDate().isAfter(date)).forEach(notesAfterDate::add);
        return notesAfterDate;
    }
    public List<Note> findNotesByMessageWord() {
        List<Note> notesByMessageWord = new ArrayList<>();

        String word = getWord();

        for (Note note : notes) {
            if (!note.getMessage().isEmpty() && note.getMessage().contains(word)) {
                notesByMessageWord.add(note);
            }
        }
        return notesByMessageWord;
    }

    public void saveNotepad() {
        NotepadFileHandler.getInstance().saveNotepad(notes);
    }

    private String getEmail() {
        String email;

        while (true) {
            NotepadPrinter.printCodeLineHelper(PrinterCode.EMAIL);

            email = in.nextLine();
            if (email.matches("^[a-z_.]{2,20}@[a-z]{2,5}\\.[a-z]{2,3}$")) {
                return email;
            } else {
                NotepadPrinter.printCodeLineError(PrinterCode.EMAIL);
            }
        }
    }
    private LocalDate getDate() {
        String providedDate;

        while (true) {
            NotepadPrinter.printCodeLineHelper(PrinterCode.DATE);

            providedDate = in.nextLine();
            if (providedDate.matches("^\\d{2}/\\d{2}/\\d{2}$")) {
                return LocalDate.parse(providedDate, DateTimeFormatter.ofPattern("dd/MM/yy"));
            } else {
                NotepadPrinter.printCodeLineError(PrinterCode.DATE);
            }
        }
    }
    private String getText() {
        String text;

        while (true) {
            NotepadPrinter.printCodeLineHelper(PrinterCode.TEXT);

            text = in.nextLine();

            if (text.matches("^[a-zA-Z ,!?\"]{4,}$")) {
                return text;
            } else {
                NotepadPrinter.printCodeLineError(PrinterCode.TEXT);
            }
        }
    }
    private String getWord(){
        String word;

        while (true) {
            NotepadPrinter.printCodeLineHelper(PrinterCode.WORD);

            word = in.nextLine();

            if (word.matches("^[a-zA-Z]+$")) {
                return word;
            }
            else {
                NotepadPrinter.printCodeLineError(PrinterCode.WORD);
            }
        }
    }
}
