package week_8;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	
	public static void main(String[] args) {
        try {
            
            File file = new File("media/myFile.txt");

            
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
