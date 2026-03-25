
package week_4;

class Person {
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
}


public class Employee extends Person {
 int employeeId;

 Employee(String name, int age, int employeeId) {
     super(name, age);   
     this.employeeId = employeeId;
 }

 void display() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Employee ID: " + employeeId);
 }
 
 public static void main(String[] args) {
	 Employee e = new Employee("Ayush" ,20 ,121);
	 e.display();
 }
}
