package week_5;

class InvalidAgeException extends Exception {

	 InvalidAgeException(String message) {
	     super(message);
	 }
}

public class Task5 {
    
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above ....");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(19); 
            
           
        } 
        catch( Exception e) {
        	System.out.println("Exception caught: " + e.getMessage());
        	
        }
    }
}
