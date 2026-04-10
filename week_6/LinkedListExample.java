package week_6;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();


        if (list.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }

        list.addFirst("Ram");
        list.addFirst("Sita");


        list.addLast("Hari");
        list.addLast("Gita");


        System.out.println("\nLinked List after insertions:");
        System.out.println(list);


        if (list.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }
    }
}
