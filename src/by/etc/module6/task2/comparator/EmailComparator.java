package by.etc.module6.task2.comparator;

import by.etc.module6.task2.entity.Note;

import java.util.Comparator;

public class EmailComparator implements Comparator<Note> {
    @Override
    public int compare(Note o1, Note o2) {

        return o1.getEmail().compareToIgnoreCase(o2.getEmail());
    }
}
