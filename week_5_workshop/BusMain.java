package week_5_workshop;


abstract class Vehicle {
 abstract void wheel();  

 void door() {
     System.out.println("Vehicle has doors");
 }
}


class Bus extends Vehicle {
 @Override
 void wheel() {
     System.out.println("Bus has 6 wheels");
 }
}

public class BusMain {
	public static void main(String[] args) {
		Bus localbus = new Bus();
		localbus.wheel();
		localbus.door();
	}

}
