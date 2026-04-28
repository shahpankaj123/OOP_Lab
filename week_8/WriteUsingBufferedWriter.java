package week_8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {

        String data = "Java is a high level and object oriented programming language";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("media/task3.txt"));
            bw.write(data);
            bw.newLine();
            bw.close();
            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
