package week_4;


class Animal2 {
 void makeSound() {
     System.out.println("Animal makes sound");
 }
}


class Dog2 extends Animal2 {
 void bark() {
     System.out.println("Dog barks");
 }
}


public class TestUpcasting {
 public static void main(String[] args) {
     Animal2 a = new Dog2();   

     a.makeSound();          
     a.bark();            
 }
}
