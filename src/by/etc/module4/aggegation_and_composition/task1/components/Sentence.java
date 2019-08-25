package by.etc.module4.aggegation_and_composition.task1.components;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private int sentenceLength;
    private List<Word> sentenceBody = new ArrayList<Word>();

    public Sentence() {
        sentenceLength = 0;
    }

    public Sentence(List<Word> wordList) {
        for (Word word : wordList) {
            sentenceBody.add(word);
            sentenceLength += word.getCharLength() + 1;
        }
    }

    public Sentence append(Word word) {
        this.sentenceBody.add(word);
        this.sentenceLength += word.getCharLength();
        return this;
    }

    public String toString() {
        if (sentenceLength == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Word word : sentenceBody) {
            sb.append(" ").append(word);
        }
        return sb.toString();
    }

}
