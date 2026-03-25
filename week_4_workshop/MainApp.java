package week_4_workshop;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Signup signup = new Signup();

        while (true) {
            System.out.println("\nPlease enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                signup.registerUser();
            } else if (choice == 2) {
                System.out.println("\nThank you for using the Application.");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();   
        }
}
