package week_8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OddEvenFileProcessor {

    public List<Integer> read(String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            if (line != null) {
                String[] parts = line.trim().split("\\s+");

                for (String num : parts) {
                    numbers.add(Integer.parseInt(num));
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }


    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }

        return even;
    }


    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> odd = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 != 0) {
                odd.add(num);
            }
        }

        return odd;
    }


    public void write(List<Integer> numbers, String filePath) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

            for (int num : numbers) {
                bw.write(num + " ");
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        OddEvenFileProcessor obj = new OddEvenFileProcessor();


        List<Integer> numbers = obj.read("media/numbers.txt");


        List<Integer> evenNumbers = obj.getEven(numbers);
        List<Integer> oddNumbers = obj.getOdd(numbers);


        obj.write(evenNumbers, "media/even.txt");
        obj.write(oddNumbers, "media/odd.txt");

        System.out.println("Processing completed. Check even.txt and odd.txt");
    }
}
