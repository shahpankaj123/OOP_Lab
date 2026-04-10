package week_6;
import java.util.*;

public class ExamineeList {
	
	public static void main(String[] args) {

        ArrayList<String> examinees = new ArrayList<>();

        examinees.add("Ram");
        examinees.add("Sita");
        examinees.add("Hari");
        examinees.add("Gita");
        examinees.add("Shyam");


        System.out.println("Original List of Examinees:");
        System.out.println(examinees);


        examinees.remove("Hari");

        System.out.println("\nUpdated List after removal:");
        System.out.println(examinees);
	}

}
