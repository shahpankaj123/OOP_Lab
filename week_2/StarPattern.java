package week_2;

public class StarPattern {
	public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {        // controls rows
            for (int j = 1; j <= i; j++) {    // prints stars
                System.out.print("*");
            }
            System.out.println();             // move to next line
        }

    }

}
