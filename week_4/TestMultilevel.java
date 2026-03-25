package week_4;


class A {
 void display() {
     System.out.println("Class A");
 }
}


class B extends A {
 @Override
 void display() {
     System.out.println("Class B");
 }
}


class C extends B {
 @Override
 void display() {
     System.out.println("Class C");
 }
}


public class TestMultilevel {
 public static void main(String[] args) {
     C obj = new C();
     obj.display();   
 }
}
