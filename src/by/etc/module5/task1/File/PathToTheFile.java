package by.etc.module5.task1.File;

import java.util.ArrayList;
import java.util.List;

public class PathToTheFile {

    private static String name;
    private List<File> files;

    public PathToTheFile(String name) {
        setName(name);
        setName(new ArrayList<>());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(List<File> files) {
        this.files = files;
    }

    public List<File> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return "Path to the file: " + "name = " + name;
    }
}
