package week_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
    String firstName;
    String lastName;
    String address;
    String contactNumber;
    String semester;

    public Student(String firstName, String lastName, String address,
                   String contactNumber, String semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.semester = semester;
    }

    public String toCSV() {
        return firstName + "," + lastName + "," + address + "," +
               contactNumber + "," + semester;
    }
}

public class StudentCSVWriter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("media/students.csv", true);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); 

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for Student " + i);

                System.out.print("First Name: ");
                String firstName = sc.nextLine();

                System.out.print("Last Name: ");
                String lastName = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                System.out.print("Contact Number: ");
                String contactNumber = sc.nextLine();

                System.out.print("Semester: ");
                String semester = sc.nextLine();

                Student student = new Student(firstName, lastName, address, contactNumber, semester);


                fw.write(student.toCSV() + "\n");
            }

            fw.close();
            sc.close();

            System.out.println("\nStudent data saved successfully in students.csv");

        } catch (IOException e) {
            System.out.println("Error occurred while writing file.");
            e.printStackTrace();
        }
    }
}
