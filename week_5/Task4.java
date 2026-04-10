package week_5;

//Interface
interface Employee {
 void printEmployeeId();
 void printSalary();
 
}


class Manager implements Employee {
 int empId = 101;
 double salary = 50000;

 public void printEmployeeId() {
     System.out.println("Manager ID: " + empId);
 }

 public void printSalary() {
     System.out.println("Manager Salary: $" + salary);
 }
}


class Developer implements Employee {
 int empId = 201;
 double salary = 40000;

 public void printEmployeeId() {
     System.out.println("Developer ID: " + empId);
 }

 public void printSalary() {
     System.out.println("Developer Salary: $" + salary);
 }
}


public class Task4 {
 public static void main(String[] args) {
     Manager m = new Manager();
     Developer d = new Developer();

     m.printEmployeeId();
     m.printSalary();

     d.printEmployeeId();
     d.printSalary();
 }
}
