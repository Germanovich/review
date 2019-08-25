package by.etc.module5.task1.File;

public abstract class File {

    private String name;
    private boolean reading;
    private boolean record;

    File(String name) {
        this.name = name + ".txt";
        this.reading = true;
        this.record = true;
    }

    public String getName() {
        return name;
    }

    boolean readFile() {
        return reading;
    }

    boolean fileRecord() {
        return record;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void checkFile();

    public abstract void printText();

    public abstract void addText(String content);

    @Override
    public String toString() {
        return name;
    }
}
