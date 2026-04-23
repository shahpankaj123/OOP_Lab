package week_5_workshop;


interface Animal {
 void eat();
 void walk();

}


interface Printable {
 void display();

}


class Cow implements Animal, Printable {
 public void eat() {
     System.out.println("Cow eats grass");
 }

 public void walk() {
     System.out.println("Cow walks on four legs");
 }

 public void display() {
     System.out.println("This is a Cow");
 }
}

public class AnimalMain {
	
	public static void main(String[] args) {
		Cow c = new Cow();
		c.eat();
		c.walk();
		c.display();
		
	}

}
