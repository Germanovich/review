package by.etc.module5.task1.utility;

import by.etc.module5.task1.File.PathToTheFile;
import by.etc.module5.task1.File.File;

public class Utility {

    private PathToTheFile pathToTheFile;

    public Utility(PathToTheFile pathToTheFile) {
        this.pathToTheFile = pathToTheFile;
    }

    public void addFile(File file) {
        pathToTheFile.getFiles().add(file);
    }

    public String getName() {
        return String.valueOf(pathToTheFile);
    }

    public void deleteFile(File file) {
        System.out.println("Delete: " + file.getName());
        pathToTheFile.getFiles().remove(file);
    }

    public void printFiles() {
        if (pathToTheFile.getFiles().isEmpty()) {
            System.out.println("File is empty!");
            return;
        }

        for (by.etc.module5.task1.File.File file : pathToTheFile.getFiles()) {
            System.out.print(file + "; ");
        }
        System.out.print("\n");
    }
}
