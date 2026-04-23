package week_5_workshop;

public class InterruptedMain {
	
	public static void main(String[] args) {
		try {

        System.out.println("Program started");
        
        Thread.sleep(5000);  
        
        System.out.println("Program resumed");
        
        Class.forName("TestClass");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());		}

		

}
}
