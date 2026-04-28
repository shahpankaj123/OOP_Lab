package week_8;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {

        String textToAppend = "\nThis text is appended to the existing file.";

        try {
            FileWriter fw = new FileWriter("media/task3.txt", true);
            fw.write(textToAppend);
            fw.close();
            System.out.println("Text appended successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
