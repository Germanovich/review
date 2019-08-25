package by.etc.module4.aggegation_and_composition.task1.components;

public class Word {
    private int charLength;
    private String wordBody;

    public Word() {
        this.wordBody = "";
        this.charLength = 0;
    }

    public Word(String wordBody) {
        this.wordBody = wordBody;
        this.charLength = wordBody.length();
    }

    public String getBody() {
        return wordBody;
    }

    public int getCharLength() {
        return charLength;
    }

    public String toString() {
        return getBody();
    }
}
