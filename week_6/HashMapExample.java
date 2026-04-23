package week_6;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {


        HashMap<String, String> contacts = new HashMap<>();


        contacts.put("ram", "9841000001");
        contacts.put("shyam", "9841000002");


        System.out.println(contacts);


        System.out.println("Sita's number: " + contacts.get("ram"));
    }

}
