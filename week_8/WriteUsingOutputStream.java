package week_8;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingOutputStream {
    public static void main(String[] args) {

        String data = "Java is a high level programming language";

        try {

            FileOutputStream fos = new FileOutputStream("media/task3.txt");

            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
