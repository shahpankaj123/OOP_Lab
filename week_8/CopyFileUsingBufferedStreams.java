package week_8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingBufferedStreams {
    public static void main(String[] args) {

        try {
            BufferedInputStream bis = new BufferedInputStream(
                    new FileInputStream("media/task4.txt"));

            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("media/destination.txt"));

            int data;

            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            bis.close();
            bos.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
