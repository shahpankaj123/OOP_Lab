package week_4;

final class Animal3 {
    void eat() {
        System.out.println("Animal eats");
    }
}


class Dog3 extends Animal3 {   
}

class Vehicle3 {
    final void start() {
        System.out.println("Vehicle starting...");
    }
}

// Attempt to inherit
class Car3 extends Vehicle3 {   
	@Override
	public void start() {
		
	}
}

public class FinalExample {

}
