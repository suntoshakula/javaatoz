package polymorphism.dynamic.type;

class Animal{
	void eat() {
		System.out.println("animal is eating");
	}
}

public class ExtensionAndBinding extends Animal{
	
	void eat() {
		System.out.println("animal is eating");
	}
	
	public static void main(String[] args) {
		System.out.println("binding example");
		Animal a = new ExtensionAndBinding();
		a.eat();
	}

}
