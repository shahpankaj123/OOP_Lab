package week_8;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingInputStream {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("media/task3.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
