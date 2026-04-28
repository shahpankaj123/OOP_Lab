package week_8;

import java.io.File;

public class FileOperationsExample {
    public static void main(String[] args) {

        File file = new File("media/myFile.txt");

        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        if (file.canRead()) {
            System.out.println("File has read permission");
        } else {
            System.out.println("File does NOT have read permission");
        }

        if (file.canWrite()) {
            System.out.println("File has write permission");
        } else {
            System.out.println("File does NOT have write permission");
        }
    }
}
