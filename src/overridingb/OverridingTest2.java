package overridingb;

class Animal {
	public void move() {
		System.out.println("animal class and move method");
	}
}

class Dog extends Animal {
	public void move() {
		System.out.println("dog class and move method");
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog();
		animal.move();
		animal = new Animal();
		animal.move();
	}

}
