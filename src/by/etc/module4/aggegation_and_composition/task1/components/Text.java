package by.etc.module4.aggegation_and_composition.task1.components;

import java.util.ArrayList;
import java.util.List;

public class Text {
    String newLine = "\n";

    private String header;
    private List<Sentence> textBody = new ArrayList<Sentence>();

    public Text() {
        header = "Not found";
    }

    public Text(String header) {
        this.header = header;
    }

    public void append(Sentence sentence) {
        this.textBody.add(sentence);
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : textBody) {
            sb.append(sentence.toString());
        }
        return sb.toString();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Text header: ").append(header).append(newLine);
        for (Sentence sentence : textBody) {
            sb.append(sentence.toString());
        }
        return sb.toString();
    }
}