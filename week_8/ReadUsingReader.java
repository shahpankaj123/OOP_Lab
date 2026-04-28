package week_8;

import java.io.FileReader;
import java.io.IOException;

public class ReadUsingReader {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("media/task4.txt");

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
