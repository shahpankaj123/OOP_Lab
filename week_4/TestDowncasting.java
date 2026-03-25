package week_4;

//Parent class
class Animal1 {
 void makeSound() {
     System.out.println("Animal makes sound");
 }
}

//Child class
class Dog1 extends Animal1 {
 void bark() {
     System.out.println("Dog barks");
 }
}

//Test class
class TestDowncasting {
 public static void main(String[] args) {
     Animal1 a = new Animal1();   

     Dog1 d = (Dog1) a;        
     d.bark();               
     d.makeSound();         
 }
}
