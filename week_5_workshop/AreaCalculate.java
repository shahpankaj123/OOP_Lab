package week_5_workshop;


abstract class Shape {
 abstract void calculateArea();
 abstract void calculatePerimeter();
 
}


class Quadrilateral extends Shape {
 int length = 10;
 int breadth = 5;

 @Override
 void calculateArea() {
     int area = length * breadth;
     System.out.println("Area of Quadrilateral: " + area);
 }

 @Override
 void calculatePerimeter() {
     int perimeter = 2 * (length + breadth);
     System.out.println("Perimeter of Quadrilateral: " + perimeter);
 }
}

public class AreaCalculate {
	public static void main(String [] args) {
		Quadrilateral q = new Quadrilateral();
		q.calculateArea();
		q.calculatePerimeter();
	}

}
