package week_6;
import java.util.LinkedList;
import java.util.Collections;

public class ColorLinkedList {
    public static void main(String[] args) {


        LinkedList<String> colors = new LinkedList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");


        System.out.println("Original List:");
        for (String color : colors) {
            System.out.println(color);
        }

        if (colors.contains("Red")) {
            System.out.println("\nRed exists in the list.");
        } else {
            System.out.println("\nRed does not exist in the list.");
        }


        Collections.shuffle(colors);
        System.out.println("\nShuffled List:");
        System.out.println(colors);


        Collections.sort(colors);
        System.out.println("\nSorted List (Ascending):");
        System.out.println(colors);
    }
}
