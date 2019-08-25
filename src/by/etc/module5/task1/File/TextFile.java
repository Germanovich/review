package by.etc.module5.task1.File;

public class TextFile extends File {

    private Text text;

    public TextFile(String name) {
        super(name);
        text = new Text("");
    }

    @Override
    public void checkFile() {
        if (readFile()) {
            System.out.println("file found");
        } else {
            System.out.println("file not found");
        }
    }

    @Override
    public void printText() {
        if (readFile()) {
            if (!text.getContent().equals("")) {
                System.out.println("Text:" + text.getContent());
            } else {
                System.out.println("Text: <empty>");
            }
        } else {
            System.out.println("Error");
        }
    }

    public void addText(String content) {
        if (fileRecord()) {
            this.text.addContent(content);
        }
    }
}
