package week_5;


abstract class Parent {

 abstract void message();
}


class ChildClass1 extends Parent {

 void message() {
     System.out.println("This is first subclass");
 }
}


class ChildClass2 extends Parent {

 void message() {
     System.out.println("This is second subclass");
 }
}


public class Main {
 public static void main(String[] args) {

     ChildClass1 obj1 = new ChildClass1();
     ChildClass2 obj2 = new ChildClass2();

     obj1.message();
     obj2.message();
 }
}
