package week_6;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("Ram");
        names.add("Sita");
        names.add("Hari");
        names.add("Gita");
        names.add("Ram"); 

        System.out.println("Names in alphabetical order:");
        System.out.println(names);
    }
}
