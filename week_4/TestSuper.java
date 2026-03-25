package week_4;


class Shape {
 String color;

 Shape(String color) {
     this.color = color;
 }

 double area() {
     return 0; 
 }
}


class Rectangle extends Shape {
 double length;
 double width;

 Rectangle(String color, double length, double width) {
     super(color);   
     this.length = length;
     this.width = width;
 }

 @Override
 double area() {
     return length * width;
 }

 void display() {
     System.out.println("Color: " + color);
     System.out.println("Area: " + area());
 }
}


public class TestSuper {
 public static void main(String[] args) {
     Rectangle r = new Rectangle("Red", 10, 5);
     r.display();
 }
}
