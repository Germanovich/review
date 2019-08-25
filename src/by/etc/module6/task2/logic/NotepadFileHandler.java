package by.etc.module6.task2.logic;

import by.etc.module6.task2.entity.Note;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NotepadFileHandler {
    private static NotepadFileHandler instance;

    private String csvFile = "C:\\Users\\Пользователь\\IdeaProjects\\untitled3\\" +
            "src\\by\\etc\\module6\\task2\\data\\notes.csv";

    private NotepadFileHandler() {
    }

    static NotepadFileHandler getInstance(){
        if (instance == null){
            return new NotepadFileHandler();
        }
        else{
            return instance;
        }
    }

    public static void setInstance(NotepadFileHandler instance) {
        NotepadFileHandler.instance = instance;
    }

    public List<Note> loadNotes(){
        List<Note> notes = new ArrayList<>();

        String line;

        try(BufferedReader br = new BufferedReader((new FileReader(csvFile)))){
            while((line = br.readLine()) != null){
                String[] date = line.split(",");

                Note note = new Note();
                if(!date[0].isEmpty()){
                    note.setSubject(date[0]);
                }
                if(!date[1].isEmpty()){
                    note.setDate(LocalDate.parse(date[1], DateTimeFormatter.ofPattern("yy/MM/dd")));
                }
                if(!date[2].isEmpty()){
                    note.setEmail(date[2]);
                }
                if(!date[3].isEmpty()){
                    note.setMessage(date[3]);
                }
                notes.add(note);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return notes;
    }

    public void saveNotepad(List<Note> notes){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))){
            for(Note note : notes){
                String sb = note.getSubject() + "," +
                        note.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yy")) + "," +
                        note.getEmail() + "," +
                        note.getMessage();
                bw.write(sb);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
