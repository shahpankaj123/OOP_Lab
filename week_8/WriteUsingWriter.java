package week_8;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingWriter {
    public static void main(String[] args) {

        String data = "Java Provide High Security and help to build Enterprise level application";

        try {

            FileWriter writer = new FileWriter("media/task4.txt");
            writer.write(data);
            writer.close();
            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
