package week_6;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {


        HashMap<Integer, String> contacts = new HashMap<>();


        contacts.put(1, "9841000001");
        contacts.put(2, "9841000002");


        System.out.println(contacts);


        System.out.println("Sita's number: " + contacts.get(1));
    }

}
