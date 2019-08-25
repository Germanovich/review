package by.etc.module5.task1.File;

class Text {

    private String content;

    Text(String content) {
        setContent(content);
    }

    String getContent() {
        return content;
    }

    private void setContent(String content) {
        this.content = content;
    }

    void addContent(String string) {
        content += " " + string;
    }
}
